package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.AlarmArgs;

public interface IDevice2ServerEventCallback extends IBaseParserCallback {
	void Device_Alarm(AlarmArgs args);
}
