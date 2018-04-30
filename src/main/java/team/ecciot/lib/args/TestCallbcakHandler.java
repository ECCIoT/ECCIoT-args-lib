package team.ecciot.lib.args;

import team.ecciot.lib.args.callback.IDeviceCmdCallback;
import team.ecciot.lib.args.callback.IServerEventCallback;
import team.ecciot.lib.args.model.impl.APIKeyInvalidArgs;
import team.ecciot.lib.args.model.impl.APIKeyVerifiedArgs;
import team.ecciot.lib.args.model.impl.AlarmArgs;
import team.ecciot.lib.args.model.impl.AskAPIKeyArgs;
import team.ecciot.lib.args.model.impl.CheckAPIKeyArgs;

public class TestCallbcakHandler implements IServerEventCallback,IDeviceCmdCallback{

	@Override
	public void EccEvent_AskAPIKey(AskAPIKeyArgs args) {
		System.out.println(args);
	}

	@Override
	public void EccEvent_APIKeyVerified(APIKeyVerifiedArgs args) {
		System.out.println(args);
	}

	@Override
	public void EccEvent_APIKeyInvalid(APIKeyInvalidArgs args) {
		System.out.println(args);
	}

	@Override
	public void InvalidActionInstruction(String action, String content) {
		System.out.println(String.format("未知的Action：%s，内容为：%s。", action, content));
	}

	@Override
	public void EccCmd_CheckAPIKey(CheckAPIKeyArgs args) {
		System.out.println(args);
	}

	@Override
	public void EccCmd_Alarm(AlarmArgs args) {
		System.out.println(args);
	}
	
}
