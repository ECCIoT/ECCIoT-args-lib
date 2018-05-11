package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Terminal_ControlDevice")
public class ControlDeviceArgs extends BaseEccArgs {
	
	private String itemID;
    private String atCmd;
    
    public ControlDeviceArgs() {}
    public ControlDeviceArgs(String content) throws ParserException {
		super(content);
	}
    
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getAtCmd() {
		return atCmd;
	}
	public void setAtCmd(String atCmd) {
		this.atCmd = atCmd;
	}
	@Override
	public void parse(JSONObject content) {
		itemID = content.getString("itemID");
		atCmd = content.getString("atCmd");
	}
}
