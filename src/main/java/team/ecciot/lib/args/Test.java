package team.ecciot.lib.args;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.event.APIKeyInvalidEventArgs;
import team.ecciot.lib.args.model.event.APIKeyVerifiedEventArgs;
import team.ecciot.lib.args.model.event.AlarmEventArgs;
import team.ecciot.lib.args.model.event.CheckAPIKeyEventArgs;
import team.ecciot.lib.args.model.event.UpdateItemsDataEventArgs;
import team.ecciot.lib.args.parser.EventParserCallback;
import team.ecciot.lib.args.parser.ContentParser;

public class Test {
	public static void main(String[] args) throws ParserException {
		ContentParser parser = new ContentParser(new EventParserCallback() {
			
			@Override
			public void InvalidActionInstruction(String action, String content) {
				System.out.println(String.format("未知的Action：%s，内容为：%s。", action, content));
			}

			@Override
			public void EccEvent_CheckAPIKey(CheckAPIKeyEventArgs args) {
				System.out.println(args.toString());
			}

			@Override
			public void EccEvent_APIKeyVerified(APIKeyVerifiedEventArgs args) {
				System.out.println(args.toString());
			}

			@Override
			public void EccEvent_APIKeyInvalid(APIKeyInvalidEventArgs args) {
				System.out.println(args.toString());
			}

			@Override
			public void EccEvent_UpdateItemsData(UpdateItemsDataEventArgs args) {
				System.out.println(args.toString());
			}

			@Override
			public void EccEvent_Alarm(AlarmEventArgs args) {
				System.out.println(args.toString());
			}
		});
		
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
