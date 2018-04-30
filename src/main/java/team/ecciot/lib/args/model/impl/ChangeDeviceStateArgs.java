package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Server_ChangeDeviceState")
public class ChangeDeviceStateArgs extends BaseEccArgs {

	private String itemID;
	private boolean state;

	public ChangeDeviceStateArgs() {
	}

	public ChangeDeviceStateArgs(String content) throws ParserException {
		super(content);
	}

	@Override
	public void parse(JSONObject content) {

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
