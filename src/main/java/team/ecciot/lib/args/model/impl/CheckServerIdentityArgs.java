package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Server_CheckServerIdentity")
public class CheckServerIdentityArgs extends BaseEccArgs {
	
	private String secretkey;
	private String apikey;
	
	public CheckServerIdentityArgs() {}
	public CheckServerIdentityArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		secretkey = content.getString("secretkey");
		apikey = content.getString("apikey");
	}
	public String getSecretkey() {
		return secretkey;
	}
	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	
	
}
