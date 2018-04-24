package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_APIKeyVerified")
public class APIKeyVerifiedEventArgs extends BaseEccEventArgs {
	
	public APIKeyVerifiedEventArgs() {}
	public APIKeyVerifiedEventArgs(String content) {
        super(content);
    }

    @Override
	public void parse(String content) {

    }
}
