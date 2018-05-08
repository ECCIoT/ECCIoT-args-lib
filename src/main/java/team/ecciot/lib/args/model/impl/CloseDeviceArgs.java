package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Server_CloseDevice")
public class CloseDeviceArgs extends BaseEccArgs {

	private String itemID;
	private boolean state;

	public CloseDeviceArgs() {
	}

	public CloseDeviceArgs(String content) throws ParserException {
		super(content);
	}

	@Override
	public void parse(JSONObject content) {
		itemID = content.getString("itemID");
		state = content.getBooleanValue("state");
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}
