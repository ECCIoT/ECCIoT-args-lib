package team.ecciot.lib.args.model.impl;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Server_QueryOnlineTerminal")
public class QueryOnlineTerminalArgs extends BaseEccArgs {
	
	public QueryOnlineTerminalArgs() {}
	public QueryOnlineTerminalArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		
	}
}
