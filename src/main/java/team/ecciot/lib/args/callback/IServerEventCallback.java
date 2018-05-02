package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.AlarmArgs;
import team.ecciot.lib.args.model.impl.BindDeviceArgs;
import team.ecciot.lib.args.model.impl.ControlItemArgs;
import team.ecciot.lib.args.model.impl.DeviceStateChangedArgs;

public interface IServerEventCallback extends IBaseParserCallback {
	
	void Device_Alarm(AlarmArgs args);
	
	void RTC_DeviceStateChanged(DeviceStateChangedArgs args);
	
	void Terminal_ControlItem(ControlItemArgs args);
	void Terminal_BindDevice(BindDeviceArgs args);
}
