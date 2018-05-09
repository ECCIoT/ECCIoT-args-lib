package team.ecciot.lib.args;

import team.ecciot.lib.args.callback.IBaseParserCallback;
import team.ecciot.lib.args.callback.ICheckIdentityCallback;
import team.ecciot.lib.args.model.impl.APIKeyInvalidArgs;
import team.ecciot.lib.args.model.impl.APIKeyVerifiedArgs;
import team.ecciot.lib.args.model.impl.AskIdentityArgs;
import team.ecciot.lib.args.model.impl.CommunicationOutageArgs;

public class TestCallbcakHandler implements ICheckIdentityCallback,IBaseParserCallback{

	@Override
	public void InvalidActionInstruction(String action, String content) {
		System.out.println(String.format("未知的Action：%s，内容为：%s。", action, content));
	}

	@Override
	public void RTC_AskIdentity(AskIdentityArgs args) {
		System.out.println(args);
	}

	@Override
	public void RTC_APIKeyVerified(APIKeyVerifiedArgs args) {
		System.out.println(args);
	}

	@Override
	public void RTC_APIKeyInvalid(APIKeyInvalidArgs args) {
		System.out.println(args);
	}

	@Override
	public void RTC_CommunicationOutage(CommunicationOutageArgs args) {
		System.out.println(args);
	}

}
