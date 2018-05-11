package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.BindDeviceArgs;
import team.ecciot.lib.args.model.impl.ControlDeviceArgs;

public interface ITerminal2ServerEventCallback extends IBaseParserCallback {
	void Terminal_ControlDevice(ControlDeviceArgs args);
	void Terminal_BindDevice(BindDeviceArgs args);
}
