package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.APIKeyInvalidArgs;
import team.ecciot.lib.args.model.impl.APIKeyVerifiedArgs;
import team.ecciot.lib.args.model.impl.AskAPIKeyArgs;

public interface IBaseEventCallback extends IBaseParserCallback {
	void EccEvent_AskAPIKey(AskAPIKeyArgs args);
	void EccEvent_APIKeyVerified(APIKeyVerifiedArgs args);
	void EccEvent_APIKeyInvalid(APIKeyInvalidArgs args);
}
