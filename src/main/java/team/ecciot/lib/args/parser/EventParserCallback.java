package team.ecciot.lib.args.parser;

import team.ecciot.lib.args.model.event.APIKeyInvalidEventArgs;
import team.ecciot.lib.args.model.event.APIKeyVerifiedEventArgs;
import team.ecciot.lib.args.model.event.AlarmEventArgs;
import team.ecciot.lib.args.model.event.CheckAPIKeyEventArgs;
import team.ecciot.lib.args.model.event.UpdateItemsDataEventArgs;

public interface EventParserCallback extends BaseParserCallback {
	void EccEvent_CheckAPIKey(CheckAPIKeyEventArgs args);
	void EccEvent_APIKeyVerified(APIKeyVerifiedEventArgs args);
	void EccEvent_APIKeyInvalid(APIKeyInvalidEventArgs args);
	void EccEvent_UpdateItemsData(UpdateItemsDataEventArgs args);
	void EccEvent_Alarm(AlarmEventArgs args);
}
