package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Server_QueryOnlineTerminals")
public class QueryOnlineTerminalsArgs extends BaseEccArgs {
	
	String apikey;
	
	public QueryOnlineTerminalsArgs() {}
	public QueryOnlineTerminalsArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		apikey = content.getString("apikey");
	}
	
	public String getApikey() {
		return apikey;
	}
	
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
}
