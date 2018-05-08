package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.CloseDeviceArgs;
import team.ecciot.lib.args.model.impl.QueryOnlineDevicesArgs;
import team.ecciot.lib.args.model.impl.QueryOnlineTerminalsArgs;

public interface IServer2RtcEventCallback extends IBaseParserCallback {
	void Server_CloseDevice(CloseDeviceArgs args);
	void Server_QueryOnlineDevices(QueryOnlineDevicesArgs args);
	void Server_QueryOnlineTerminals(QueryOnlineTerminalsArgs args);
}
