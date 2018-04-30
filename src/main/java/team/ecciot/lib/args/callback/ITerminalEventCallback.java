package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.event.AlarmEventArgs;
import team.ecciot.lib.args.model.event.UpdateItemsDataEventArgs;

public interface ITerminalEventCallback extends IBaseEventCallback {
	void EccEvent_Alarm(AlarmEventArgs args);
	void EccEvent_UpdateItemsData(UpdateItemsDataEventArgs args);
}
