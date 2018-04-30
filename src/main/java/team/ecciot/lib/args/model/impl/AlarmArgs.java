package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "EccCmd_Alarm")
public class AlarmArgs extends BaseEccArgs {

	private String itemID;
	private String field;
	private String value;
	
	public AlarmArgs() {}
	public AlarmArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		
	}
	
	public String getItemID() {
		return itemID;
	}
	public String getField() {
		return field;
	}
	public String getValue() {
		return value;
	}
}
