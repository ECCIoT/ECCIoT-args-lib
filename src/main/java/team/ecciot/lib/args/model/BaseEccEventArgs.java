package team.ecciot.lib.args.model;

import team.ecciot.lib.args.exception.ParserException;

public abstract class BaseEccEventArgs extends BaseEccArgs {

	public BaseEccEventArgs() {}
	
	public BaseEccEventArgs(String content) throws ParserException {
		super(content);
	}
}
