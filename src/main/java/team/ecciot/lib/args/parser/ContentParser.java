package team.ecciot.lib.args.parser;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.callback.IBaseParserCallback;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;
import team.ecciot.lib.args.utils.ParserUtils;

public class ContentParser {

	private IBaseParserCallback callback;
	private Class<? extends IBaseParserCallback> clazz;
	
	public ContentParser(IBaseParserCallback callback,Class<? extends IBaseParserCallback> callbackClass){
		this.callback = callback;
		this.clazz = callbackClass;
	}
	
	public ContentParser(IBaseParserCallback callback){
		this.callback = callback;
		this.clazz = callback.getClass();
	}
	
	public boolean parse(String action, String content) throws ParserException {
		// ===根据action创建参数对象
		// 判断Action是否存在
		if (!ParserUtils.HM_ACTION_ARGS.containsKey(action)) {
			// 不存在则触发无效指令的回调方法
			callback.InvalidActionInstruction(action, content);
			return false;
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
				//返回true，表示解析成功
				return true;
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				//指令存在，但不存在当前所指定的Callback中。
				callback.InvalidActionInstruction(action, content);
				return false;
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			return false;
		}
	}
	
	public static boolean checkActionValidity(String action){
		return ParserUtils.HM_ACTION_ARGS.containsKey(action);
	}
}