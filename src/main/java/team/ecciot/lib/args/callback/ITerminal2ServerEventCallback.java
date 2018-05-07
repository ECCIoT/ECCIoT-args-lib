package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.BindDeviceArgs;
import team.ecciot.lib.args.model.impl.ControlItemArgs;

public interface ITerminal2ServerEventCallback extends IBaseParserCallback {
	void Terminal_ControlItem(ControlItemArgs args);
	void Terminal_BindDevice(BindDeviceArgs args);
}
