package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.EventArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@EventArgsAnnotation(action = "EccEvent_APIKeyVerified")
public class APIKeyVerifiedEventArgs extends BaseEccEventArgs {
    public APIKeyVerifiedEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {

    }
}
