package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "RTC_TerminalStateChanged")
public class TerminalStateChangedArgs extends BaseEccArgs {

	private String token;
	private boolean state;
	private CheckTerminalIdentityArgs terminalInfo;

	public TerminalStateChangedArgs() {
	}
	public TerminalStateChangedArgs(String content) throws ParserException {
		super(content);
	}
	@Override
	public void parse(JSONObject content) {
		token = content.getString("token");
		state = content.getBooleanValue("state");
		if(content.containsKey("terminalInfo")){
			terminalInfo = new CheckTerminalIdentityArgs();
			JSONObject json = content.getJSONObject("terminalInfo");
			terminalInfo.parse(json);
		}
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public CheckTerminalIdentityArgs getTerminalInfo() {
		return terminalInfo;
	}
	public void setTerminalInfo(CheckTerminalIdentityArgs terminalInfo) {
		this.terminalInfo = terminalInfo;
	}
}
