package team.ecciot.lib.args.model.event;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_APIKeyVerified")
public class APIKeyVerifiedEventArgs extends BaseEccEventArgs {
	
	public APIKeyVerifiedEventArgs() {}
	public APIKeyVerifiedEventArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		
	}
}
