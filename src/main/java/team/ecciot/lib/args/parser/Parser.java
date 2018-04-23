package team.ecciot.lib.args.parser;

public class Parser {
	
	private BaseParserCallback callback;
	private ParserCallbackType type;
	
	public Parser(BaseParserCallback callback,ParserCallbackType type){
		this.callback = callback;
		this.type = type;
	}
	public Parser(CmdParserCallback cmdParserCallback) {
		this.callback = cmdParserCallback;
		this.type = ParserCallbackType.CMD_CALLBACK;
	}
	
	public Parser(EventParserCallback eventParserCallback) {
		this.callback = eventParserCallback;
		this.type = ParserCallbackType.EVENT_CALLBACK;
	}
	
	public void parse(String action,String content){
		//根据action创建参数对象
		
		//触发回调接口返回参数对象
	}
}
