package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "RTC_DeviceStateChanged")
public class DeviceStateChangedArgs extends BaseEccArgs {

	private String itemID;
	private boolean state;
	private CheckDeviceIdentityArgs deviceInfo;

	public DeviceStateChangedArgs() {
	}

	public DeviceStateChangedArgs(String content) throws ParserException {
		super(content);
	}

	@Override
	public void parse(JSONObject content) {
		itemID = content.getString("itemID");
		state = content.getBooleanValue("state");
		if(content.containsKey("deviceInfo")){
			deviceInfo = new CheckDeviceIdentityArgs();
			deviceInfo.parse(content.getJSONObject("deviceInfo"));
		}
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
	public CheckDeviceIdentityArgs getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(CheckDeviceIdentityArgs deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
}
