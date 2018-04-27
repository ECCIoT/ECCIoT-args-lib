package team.ecciot.lib.args.parser;

import team.ecciot.lib.args.model.cmd.CheckAPIKeyCmdArgs;
import team.ecciot.lib.args.model.cmd.ControlItemCmdArgs;

public interface CmdParserCallback extends BaseParserCallback{
	void EccCmd_CheckAPIKey(CheckAPIKeyCmdArgs args);
	void EccCmd_ControlItem(ControlItemCmdArgs args);
}
