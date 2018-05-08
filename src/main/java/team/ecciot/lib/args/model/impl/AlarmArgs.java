package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Device_Alarm")
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
		itemID = content.getString("itemID");
		field = content.getString("field");
		value = content.getString("value");
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
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public void setField(String field) {
		this.field = field;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
