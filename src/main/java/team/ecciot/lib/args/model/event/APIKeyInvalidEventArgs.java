package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.EventArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@EventArgsAnnotation(action = "EccEvent_APIKeyInvalid")
public class APIKeyInvalidEventArgs extends BaseEccEventArgs {
    public APIKeyInvalidEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {

    }
}
