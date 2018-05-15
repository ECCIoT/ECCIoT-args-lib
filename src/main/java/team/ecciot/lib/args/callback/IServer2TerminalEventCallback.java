package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.UpdateItemsDataArgs;

public interface IServer2TerminalEventCallback extends IBaseParserCallback {
	void Server_UpdateItemsData(UpdateItemsDataArgs args);
	
}
