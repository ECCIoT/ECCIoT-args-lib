package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Terminal_RequestRefresh")
public class RequestRefreshArgs extends BaseEccArgs {

	private String token;

	public RequestRefreshArgs() {
	}

	public RequestRefreshArgs(String content) throws ParserException {
		super(content);
	}

	@Override
	public void parse(JSONObject content) {
		token = content.getString("token");
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
}
