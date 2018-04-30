package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.AlarmArgs;

public interface IDeviceCmdCallback extends IBaseCmdCallback {
	void EccCmd_Alarm(AlarmArgs args);
}
