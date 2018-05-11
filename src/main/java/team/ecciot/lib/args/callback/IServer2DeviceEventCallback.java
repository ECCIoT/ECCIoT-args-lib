package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.ServerControlDeviceArgs;

public interface IServer2DeviceEventCallback extends IBaseParserCallback {
	void Server_ServerControlDevice(ServerControlDeviceArgs args);
}
