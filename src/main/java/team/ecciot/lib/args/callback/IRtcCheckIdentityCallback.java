package team.ecciot.lib.args.callback;

import team.ecciot.lib.args.model.impl.CheckDeviceIdentityArgs;
import team.ecciot.lib.args.model.impl.CheckServerIdentityArgs;
import team.ecciot.lib.args.model.impl.CheckTerminalIdentityArgs;

public interface IRtcCheckIdentityCallback extends IBaseParserCallback{
	//关于校验身份信息
	void Server_CheckServerIdentity(CheckServerIdentityArgs args);		//身份信息包含CMS的密匙、APIKEY
	void Device_CheckDeviceIdentity(CheckDeviceIdentityArgs args);		//身份信息包含APIKEY、ID、设备型号、代码版本
	void Terminal_CheckTerminalIdentity(CheckTerminalIdentityArgs args);	//身份信息包含APIKEY、token、终端平台、应用版本等信息
}
