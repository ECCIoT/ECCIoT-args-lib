package team.ecciot.lib.args.model.event;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_APIKeyInvalid")
public class APIKeyInvalidEventArgs extends BaseEccEventArgs {
	
	public APIKeyInvalidEventArgs() {}
	public APIKeyInvalidEventArgs(String content) throws ParserException {
        super(content);
    }

	@Override
	public void parse(JSONObject content) {
		
	}
}
