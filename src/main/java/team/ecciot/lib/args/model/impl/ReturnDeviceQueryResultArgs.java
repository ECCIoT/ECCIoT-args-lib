package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "RTC_ReturnDeviceQueryResult")
public class ReturnDeviceQueryResultArgs extends BaseEccArgs {

	private String apikey;
	private DeviceInfo[] devices;
	
	public ReturnDeviceQueryResultArgs() {}
	public ReturnDeviceQueryResultArgs(String content) throws ParserException {
        super(content);
    }
	
	@Override
	public void parse(JSONObject content) {
		apikey = content.getString("apikey");
		devices = (DeviceInfo[]) content.getJSONArray("devices").toArray();
	}
	
	public String getApikey() {
		return apikey;
	}
	public void setApikey(String apikey) {
		this.apikey = apikey;
	}
	public DeviceInfo[] getDevices() {
		return devices;
	}
	public void setDevices(DeviceInfo[] devices) {
		this.devices = devices;
	}
	
	public static class DeviceInfo{
		private String itemID;
		private String model;
		private String version;
		
		public DeviceInfo() {}
		
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
		
		@Override
		public String toString() {
			return JSON.toJSONString(this);
		}
	}

}
