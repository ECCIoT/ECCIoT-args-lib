package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.APIKeyInvalidArgs;
import team.ecciot.lib.args.model.impl.APIKeyVerifiedArgs;
import team.ecciot.lib.args.model.impl.AlarmArgs;
import team.ecciot.lib.args.model.impl.AskIdentityArgs;
import team.ecciot.lib.args.model.impl.BindDeviceArgs;
import team.ecciot.lib.args.model.impl.ControlItemArgs;
import team.ecciot.lib.args.model.impl.DeviceStateChangedArgs;

public interface IServerEventCallback extends IBaseParserCallback {
	void Device_Alarm(AlarmArgs args);
	
	void RTC_DeviceStateChanged(DeviceStateChangedArgs args);
	void RTC_AskIdentity(AskIdentityArgs args);
	void RTC_APIKeyVerified(APIKeyVerifiedArgs args);
	void RTC_APIKeyInvalid(APIKeyInvalidArgs args);
	
	void Terminal_ControlItem(ControlItemArgs args);
	void Terminal_BindDevice(BindDeviceArgs args);
}
