package team.ecciot.lib.args.parser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;
import team.ecciot.lib.args.utils.ClassUtil;

public class ContentParser {

	private BaseParserCallback callback;
	private ParserCallbackType type;
	
	public ContentParser(BaseParserCallback callback,ParserCallbackType type){
		this.callback = callback;
		this.type = type;
	}
	public ContentParser(CmdParserCallback cmdParserCallback) {
		this.callback = cmdParserCallback;
		this.type = ParserCallbackType.CMD_CALLBACK;
	}
	
	public ContentParser(EventParserCallback eventParserCallback) {
		this.callback = eventParserCallback;
		this.type = ParserCallbackType.EVENT_CALLBACK;
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
				Method callbackMethod = getCallbackClass().getMethod(action, Class.forName(argsModelClassName));
				callbackMethod.invoke(callback, obj);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
	}
	
	//根据type类型获取callback的对应类
	private Class<?> getCallbackClass(){
		return type == ParserCallbackType.CMD_CALLBACK?CmdParserCallback.class:EventParserCallback.class;
	}
}

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
					//System.out.println(action + "\t------\t" + c.getName());
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