package team.ecciot.lib.args.model.cmd;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccCmd_Alarm")
public class AlarmCmdArgs extends BaseEccEventArgs {

	private String itemID;
	private String field;
	private String value;
	
	public AlarmCmdArgs() {}
	public AlarmCmdArgs(String content) throws ParserException {
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
