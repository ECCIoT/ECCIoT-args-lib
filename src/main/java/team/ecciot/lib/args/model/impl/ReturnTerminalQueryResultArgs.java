package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "RTC_ReturnTerminalQueryResult")
public class ReturnTerminalQueryResultArgs extends BaseEccArgs {

	private String apikey;
	private TerminalInfo[] terminals;
	
	public ReturnTerminalQueryResultArgs() {}
	public ReturnTerminalQueryResultArgs(String content) throws ParserException {
        super(content);
    }
	
	@Override
	public void parse(JSONObject content) {
		apikey = content.getString("apikey");
		terminals = (TerminalInfo[]) content.getJSONArray("terminals").toArray();
	}
	
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public TerminalInfo[] getDevices() {
		return terminals;
	}
	public void setTerminals(TerminalInfo[] devices) {
		this.terminals = devices;
	}
	
	public static class TerminalInfo{
		private String token;
		private String platform;
		private String version;

		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public String getPlatform() {
			return platform;
		}
		public void setPlatform(String platform) {
			this.platform = platform;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		
		@Override
		public String toString() {
			return JSON.toJSONString(this);
		}
	}

}
