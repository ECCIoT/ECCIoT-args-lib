package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "RTC_APIKeyInvalid")
public class APIKeyInvalidArgs extends BaseEccArgs {
	
	private String message;
	
	public APIKeyInvalidArgs() {}
	public APIKeyInvalidArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
