package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.cmd.AlarmCmdArgs;

public interface IDeviceCmdCallback extends IBaseCmdCallback {
	void EccCmd_Alarm(AlarmCmdArgs args);
}
