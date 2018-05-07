package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.AlarmArgs;
import team.ecciot.lib.args.model.impl.UpdateItemsDataArgs;

public interface IDevice2TerminalEventCallback extends IBaseParserCallback {
	void Device_Alarm(AlarmArgs args);
}
