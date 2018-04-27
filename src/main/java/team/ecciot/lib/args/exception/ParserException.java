package team.ecciot.lib.args.exception;

public class ParserException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParserException(){
		super("Data parsing failed.");
	}
}
