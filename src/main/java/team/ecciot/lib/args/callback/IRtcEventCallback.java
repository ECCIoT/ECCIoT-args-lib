package team.ecciot.lib.args.callback;

public interface IRtcEventCallback extends IBaseParserCallback {
	
	
	void Server_ChangeDeviceState();
	void Server_QueryOnlineDevices();
	void Server_QueryOnlineTerminal();
	
	//关于校验身份信息
	void Server_CheckServerIdentity();		//身份信息包含CMS的登录账号、APIKEY
	void Device_CheckDeviceIdentity();		//身份信息包含APIKEY、ID、设备型号、代码版本
	void Terminal_CheckTerminalIdentity();	//身份信息包含APIKEY、token、终端平台、应用版本等信息
}
