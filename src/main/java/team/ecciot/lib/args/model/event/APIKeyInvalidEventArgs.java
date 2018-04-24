package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_APIKeyInvalid")
public class APIKeyInvalidEventArgs extends BaseEccEventArgs {
	
	public APIKeyInvalidEventArgs() {}
	public APIKeyInvalidEventArgs(String content) {
        super(content);
    }

    @Override
	public void parse(String content) {

    }
}
