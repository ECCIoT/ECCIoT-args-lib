package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "EccCmd_CheckAPIKey")
public class CheckAPIKeyArgs extends BaseEccArgs{
	
	public CheckAPIKeyArgs() {}
	
	public CheckAPIKeyArgs(String content) throws ParserException {
		super(content);
	}

	private String apiKey;

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public void parse(JSONObject content) {
		apiKey = content.getString("apiKey");
	}
}
