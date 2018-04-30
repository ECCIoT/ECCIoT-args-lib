package team.ecciot.lib.args.parser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.callback.IBaseCmdCallback;
import team.ecciot.lib.args.callback.IBaseEventCallback;
import team.ecciot.lib.args.callback.IBaseParserCallback;
import team.ecciot.lib.args.callback.ICmsCmdCallback;
import team.ecciot.lib.args.callback.ICmsEventCallback;
import team.ecciot.lib.args.callback.IDeviceCmdCallback;
import team.ecciot.lib.args.callback.IDeviceEventCallback;
import team.ecciot.lib.args.callback.IRtcCmdCallback;
import team.ecciot.lib.args.callback.IRtcEventCallback;
import team.ecciot.lib.args.callback.IServerCmdCallback;
import team.ecciot.lib.args.callback.IServerEventCallback;
import team.ecciot.lib.args.callback.ITerminalCmdCallback;
import team.ecciot.lib.args.callback.ITerminalEventCallback;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;
import team.ecciot.lib.args.utils.ClassUtil;

/**
 * 扫描参数模型的工具类
 * @author Landriesnidis
 *
 */
class ParserUtils{
	public static HashMap<String, String> HM_ACTION_ARGS;
	
	static{
		try {
			HM_ACTION_ARGS =scanPackage("team.ecciot.lib.args.model") ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static HashMap<String, String> scanPackage(String pkg) throws Exception {
		List<Class<?>> lst = ClassUtil.getClasses(pkg);
		HashMap<String, String> hm = new HashMap<String, String>();
		
		for(Class<?> c:lst){
			if(c.getAnnotations().length>0){
				if(c.isAnnotationPresent(ArgsAnnotation.class)){
					ArgsAnnotation an = c.getAnnotation(ArgsAnnotation.class);
					String action = an.action();
					if(hm.containsKey(action)){
						throw new Exception(String.format("action:%s has already been registered.", action));
					}else{
						hm.put(action, c.getName());
					}
				}
			}
		}
		return hm;
	}
}

public class ContentParser {

	private IBaseParserCallback callback;
	private Class<? extends IBaseParserCallback> clazz;
	
	public ContentParser(IBaseParserCallback callback,Class<? extends IBaseParserCallback> callbackClass){
		this.callback = callback;
		this.clazz = callbackClass;
	}

	public ContentParser(ICmsCmdCallback callback) {
		this.callback = callback;
		this.clazz = ICmsCmdCallback.class;
	}
	
	public ContentParser(ICmsEventCallback callback) {
		this.callback = callback;
		this.clazz = ICmsEventCallback.class;
	}
	
	public ContentParser(IDeviceCmdCallback callback) {
		this.callback = callback;
		this.clazz = IDeviceCmdCallback.class;
	}
	
	public ContentParser(IDeviceEventCallback callback) {
		this.callback = callback;
		this.clazz = IDeviceEventCallback.class;
	}
	
	public ContentParser(IRtcCmdCallback callback) {
		this.callback = callback;
		this.clazz = IRtcCmdCallback.class;
	}
	
	public ContentParser(IRtcEventCallback callback) {
		this.callback = callback;
		this.clazz = IRtcEventCallback.class;
	}
	
	public ContentParser(IServerCmdCallback callback) {
		this.callback = callback;
		this.clazz = IServerCmdCallback.class;
	}
	
	public ContentParser(IServerEventCallback callback) {
		this.callback = callback;
		this.clazz = IServerEventCallback.class;
	}
	
	public ContentParser(ITerminalCmdCallback callback) {
		this.callback = callback;
		this.clazz = ITerminalCmdCallback.class;
	}
	
	public ContentParser(ITerminalEventCallback callback) {
		this.callback = callback;
		this.clazz = ITerminalEventCallback.class;
	}

	
	public void parse(String action, String content) throws ParserException {
		// ===根据action创建参数对象
		// 判断Action是否存在
		if (!ParserUtils.HM_ACTION_ARGS.containsKey(action)) {
			// 不存在则触发无效指令的回调方法
			callback.InvalidActionInstruction(action, content);
			return;
		} else {
			// 获取参数类型名称
			String argsModelClassName = ParserUtils.HM_ACTION_ARGS.get(action);
			try {
				// 根据动作指令类型获取参数类型的完整名称，并以此通过反射创建参数对象
				Object obj = Class.forName(argsModelClassName).newInstance();
				// 调用参数对象的parse方法(获取parse方法，再传入参数)
				Method parseMethod = Class.forName(argsModelClassName).getMethod("parse", JSONObject.class);
				parseMethod.invoke(obj, BaseEccArgs.castString2Json(content));
				// 触发回调接口返回参数对象
				Method callbackMethod = clazz.getMethod(action, Class.forName(argsModelClassName));
				callbackMethod.invoke(callback, obj);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				//指令存在，但不存在当前所指定的Callback中。
				callback.InvalidActionInstruction(action, content);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static boolean checkActionValidity(String action){
		return ParserUtils.HM_ACTION_ARGS.containsKey(action);
	}
}