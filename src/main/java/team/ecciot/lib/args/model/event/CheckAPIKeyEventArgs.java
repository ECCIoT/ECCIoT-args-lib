package team.ecciot.lib.args.model.event;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_CheckAPIKey")
public class CheckAPIKeyEventArgs extends BaseEccEventArgs {
	
	private String user,pwd;
	
	public CheckAPIKeyEventArgs() {}
	public CheckAPIKeyEventArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		user = content.getString("user");
		pwd = content.getString("pwd");
	}
	
	public String getPwd() {
		return pwd;
	}
	public String getUser() {
		return user;
	}
	
}
