package team.ecciot.lib.args;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.builder.CmdBuilder;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.impl.AlarmArgs;
import team.ecciot.lib.args.parser.ContentParser;


public class Test {
	public static void main(String[] args) throws ParserException {
		ContentParser parser = new ContentParser(new TestCallbcakHandler());
		
		JSONObject json = new JSONObject();
		json.put("user", "admin");
		json.put("pwd", "123456");
		
		//System.out.println(json.toJSONString());
		parser.parse("RTC_AskIdentity", json.toJSONString());
		
//		CheckAPIKeyEventArgs rag;
//		try {
//			arg = new CheckAPIKeyEventArgs(json.toJSONString());
//			System.out.println(JSON.toJSON(arg));
//		} catch (ParserException e) {
//			e.printStackTrace();
//		}
		
		
		System.out.println("*******************************************");
		AlarmArgs aa = new AlarmArgs();
		aa.setItemID("itemid-00000001");
		aa.setField("value");
		aa.setValue("98%");
		JSONObject j = CmdBuilder.build(aa,"Device","Light-01");
		System.out.println(j);
		
	}
}
