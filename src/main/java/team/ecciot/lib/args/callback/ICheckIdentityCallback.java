package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.APIKeyInvalidArgs;
import team.ecciot.lib.args.model.impl.APIKeyVerifiedArgs;
import team.ecciot.lib.args.model.impl.AskIdentityArgs;
import team.ecciot.lib.args.model.impl.CommunicationOutageArgs;

public interface ICheckIdentityCallback extends IBaseParserCallback {
	void RTC_AskIdentity(AskIdentityArgs args);
	void RTC_APIKeyVerified(APIKeyVerifiedArgs args);
	void RTC_APIKeyInvalid(APIKeyInvalidArgs args);
	void RTC_CommunicationOutage(CommunicationOutageArgs args);
}
