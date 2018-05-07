package team.ecciot.lib.args.builder;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccArgs;

public class CmdBuilder {
	
	public static JSONObject build(BaseEccArgs args){
		//获取与参数类型对应的Action
		String action = getActionNameByArgsObject(args);
		//实例化一个JsonObject对象
		JSONObject json = new JSONObject();
		json.put("action", action);
		json.put("content", args);
		return json;
	}
	
	public static JSONObject build(BaseEccArgs args,String client,String uid){
		//通过参数获取对应的json对象
		JSONObject json = build(args);
		//向参数对象中加入附带属性
		json.put("client", client);
		json.put("uid", uid);
		return json;
	}
	
	public static String getActionNameByArgsObject(BaseEccArgs args){
		//返回与参数对象对应的Action名称
		return getActionNameByArgsClass(args.getClass());
	}
	
	public static String getActionNameByArgsClass(Class<? extends BaseEccArgs> clazz){
		//获取参数类对应的Annotation
		ArgsAnnotation an = clazz.getAnnotation(ArgsAnnotation.class);
		//返回与参数类型对应的Action名称
		return an.action();
	}
}
