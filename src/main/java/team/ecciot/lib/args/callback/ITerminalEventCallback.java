package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.AlarmArgs;
import team.ecciot.lib.args.model.impl.UpdateItemsDataArgs;

public interface ITerminalEventCallback extends IBaseParserCallback {
	void EccEvent_Alarm(AlarmArgs args);
	void EccEvent_UpdateItemsData(UpdateItemsDataArgs args);
}
