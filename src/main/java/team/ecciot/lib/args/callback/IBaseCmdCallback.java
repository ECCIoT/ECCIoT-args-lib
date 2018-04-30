package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.cmd.CheckAPIKeyCmdArgs;

public interface IBaseCmdCallback extends IBaseParserCallback{
	void EccCmd_CheckAPIKey(CheckAPIKeyCmdArgs args);
}
