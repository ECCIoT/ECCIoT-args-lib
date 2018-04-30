package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.event.APIKeyInvalidEventArgs;
import team.ecciot.lib.args.model.event.APIKeyVerifiedEventArgs;
import team.ecciot.lib.args.model.event.CheckAPIKeyEventArgs;

public interface IBaseEventCallback extends IBaseParserCallback {
	void EccEvent_CheckAPIKey(CheckAPIKeyEventArgs args);
	void EccEvent_APIKeyVerified(APIKeyVerifiedEventArgs args);
	void EccEvent_APIKeyInvalid(APIKeyInvalidEventArgs args);
}
