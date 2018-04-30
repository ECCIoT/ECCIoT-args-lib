package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.CheckAPIKeyArgs;

public interface IBaseCmdCallback extends IBaseParserCallback{
	void EccCmd_CheckAPIKey(CheckAPIKeyArgs args);
}
