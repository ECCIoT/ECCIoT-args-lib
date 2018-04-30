package team.ecciot.lib.args;

import team.ecciot.lib.args.callback.IDeviceCmdCallback;
import team.ecciot.lib.args.callback.IServerEventCallback;
import team.ecciot.lib.args.model.cmd.AlarmCmdArgs;
import team.ecciot.lib.args.model.cmd.CheckAPIKeyCmdArgs;
import team.ecciot.lib.args.model.event.APIKeyInvalidEventArgs;
import team.ecciot.lib.args.model.event.APIKeyVerifiedEventArgs;
import team.ecciot.lib.args.model.event.CheckAPIKeyEventArgs;

public class TestCallbcakHandler implements IServerEventCallback,IDeviceCmdCallback{

	@Override
	public void EccEvent_CheckAPIKey(CheckAPIKeyEventArgs args) {
		System.out.println(args);
	}

	@Override
	public void EccEvent_APIKeyVerified(APIKeyVerifiedEventArgs args) {
		System.out.println(args);
	}

	@Override
	public void EccEvent_APIKeyInvalid(APIKeyInvalidEventArgs args) {
		System.out.println(args);
	}

	@Override
	public void InvalidActionInstruction(String action, String content) {
		System.out.println(String.format("未知的Action：%s，内容为：%s。", action, content));
	}

	@Override
	public void EccCmd_CheckAPIKey(CheckAPIKeyCmdArgs args) {
		System.out.println(args);
	}

	@Override
	public void EccCmd_Alarm(AlarmCmdArgs args) {
		System.out.println(args);
	}
	
}
