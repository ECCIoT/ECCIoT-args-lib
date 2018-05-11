package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Server_ServerControlDevice")
public class ServerControlDeviceArgs extends BaseEccArgs {
	
    private String atCmd;
    
    public ServerControlDeviceArgs() {}
    public ServerControlDeviceArgs(String content) throws ParserException {
		super(content);
	}
    
	public String getAtCmd() {
		return atCmd;
	}
	public void setAtCmd(String atCmd) {
		this.atCmd = atCmd;
	}
	@Override
	public void parse(JSONObject content) {
		atCmd = content.getString("atCmd");
	}
}
