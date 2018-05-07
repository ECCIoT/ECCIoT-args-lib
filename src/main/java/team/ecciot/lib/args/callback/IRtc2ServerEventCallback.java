package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.DeviceStateChangedArgs;

public interface IRtc2ServerEventCallback extends IBaseParserCallback {
	void RTC_DeviceStateChanged(DeviceStateChangedArgs args);
}
