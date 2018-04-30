package team.ecciot.lib.args.callback;

public interface IBaseParserCallback{
	/**
	 * 无效的动作指令
	 * @param action
	 * @param content
	 */
	void InvalidActionInstruction(String action,String content);
}
