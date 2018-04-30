package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.cmd.ControlItemCmdArgs;

public interface ITerminalCmdCallback extends IBaseCmdCallback {
	void EccCmd_ControlItem(ControlItemCmdArgs args);
	
}
