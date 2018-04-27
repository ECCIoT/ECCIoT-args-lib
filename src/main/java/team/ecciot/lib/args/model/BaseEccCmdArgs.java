package team.ecciot.lib.args.model;

import team.ecciot.lib.args.exception.ParserException;

public abstract class BaseEccCmdArgs extends BaseEccArgs {

	public BaseEccCmdArgs() {}
	public BaseEccCmdArgs(String content) throws ParserException {
		super(content);
	}
}
