package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.EventArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@EventArgsAnnotation(action = "EccEvent_CheckAPIKey")
public class CheckAPIKeyEventArgs extends BaseEccEventArgs {
    public CheckAPIKeyEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {

    }
}
