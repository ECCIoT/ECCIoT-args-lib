package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.APIKeyInvalidArgs;
import team.ecciot.lib.args.model.impl.APIKeyVerifiedArgs;
import team.ecciot.lib.args.model.impl.AskIdentityArgs;

public interface ICheckIdentityCallback {
	void RTC_AskIdentity(AskIdentityArgs args);
	void RTC_APIKeyVerified(APIKeyVerifiedArgs args);
	void RTC_APIKeyInvalid(APIKeyInvalidArgs args);
}
