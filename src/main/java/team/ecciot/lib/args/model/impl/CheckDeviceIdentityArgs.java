package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Device_CheckDeviceIdentity")
public class CheckDeviceIdentityArgs extends BaseEccArgs {
	
	private String apikey;
	private String itemID;
	private String model;
	private String version;
	
	public CheckDeviceIdentityArgs() {}
	public CheckDeviceIdentityArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		apikey = content.getString("apikey");
		itemID = content.getString("itemID");
		model = content.getString("model");
		version = content.getString("version");
	}
	
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
