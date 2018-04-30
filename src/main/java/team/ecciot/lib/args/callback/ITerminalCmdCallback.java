package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.ControlItemArgs;

public interface ITerminalCmdCallback extends IBaseCmdCallback {
	void EccCmd_ControlItem(ControlItemArgs args);
	
}
