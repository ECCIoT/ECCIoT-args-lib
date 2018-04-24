package team.ecciot.lib.args.parser;

public interface BaseParserCallback{
	/**
	 * 无效的动作指令
	 * @param action
	 * @param content
	 */
	void InvalidActionInstruction(String action,String content);
}
