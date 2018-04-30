package team.ecciot.lib.args;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.parser.ContentParser;


public class Test {
	public static void main(String[] args) throws ParserException {
		ContentParser parser = new ContentParser(new TestCallbcakHandler(),TestCallbcakHandler.class);
		
		JSONObject json = new JSONObject();
		json.put("user", "admin");
		json.put("pwd", "123456");
		
		//System.out.println(json.toJSONString());
		parser.parse("EccEvent_CheckAPIKey", json.toJSONString());
		
//		CheckAPIKeyEventArgs arg;
//		try {
//			arg = new CheckAPIKeyEventArgs(json.toJSONString());
//			System.out.println(JSON.toJSON(arg));
//		} catch (ParserException e) {
//			e.printStackTrace();
//		}
		
	}
}
