package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "EccEvent_AskAPIKey")
public class AskAPIKeyArgs extends BaseEccArgs {
	
	private String user,pwd;
	
	public AskAPIKeyArgs() {}
	public AskAPIKeyArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		user = content.getString("user");
		pwd = content.getString("pwd");
	}
	
	public String getPwd() {
		return pwd;
	}
	public String getUser() {
		return user;
	}
	
}