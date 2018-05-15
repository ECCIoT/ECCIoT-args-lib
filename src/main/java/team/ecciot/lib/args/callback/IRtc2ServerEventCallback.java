package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.CommunicationOutageArgs;
import team.ecciot.lib.args.model.impl.DeviceStateChangedArgs;
import team.ecciot.lib.args.model.impl.ReturnDeviceQueryResultArgs;
import team.ecciot.lib.args.model.impl.ReturnTerminalQueryResultArgs;
import team.ecciot.lib.args.model.impl.TerminalStateChangedArgs;

public interface IRtc2ServerEventCallback extends IBaseParserCallback {
	void RTC_DeviceStateChanged(DeviceStateChangedArgs args);
	void RTC_TerminalStateChanged(TerminalStateChangedArgs args);
	void RTC_ReturnDeviceQueryResult(ReturnDeviceQueryResultArgs args);
	void RTC_ReturnTerminalQueryResult(ReturnTerminalQueryResultArgs args);
	void RTC_CommunicationOutage(CommunicationOutageArgs args);
}
