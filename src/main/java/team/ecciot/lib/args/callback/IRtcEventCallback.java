package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.ChangeDeviceStateArgs;
import team.ecciot.lib.args.model.impl.QueryOnlineDevicesArgs;
import team.ecciot.lib.args.model.impl.QueryOnlineTerminalArgs;

public interface IRtcEventCallback extends IBaseParserCallback {
	void Server_ChangeDeviceState(ChangeDeviceStateArgs args);
	void Server_QueryOnlineDevices(QueryOnlineDevicesArgs args);
	void Server_QueryOnlineTerminal(QueryOnlineTerminalArgs args);
}
