package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.CommunicationOutageArgs;

public interface IRtc2CmsEventCallback extends IBaseParserCallback {
	void RTC_CommunicationOutage(CommunicationOutageArgs args);
}
