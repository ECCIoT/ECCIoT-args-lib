package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_CheckAPIKey")
public class CheckAPIKeyEventArgs extends BaseEccEventArgs {
	
	public CheckAPIKeyEventArgs() {}
	public CheckAPIKeyEventArgs(String content) {
        super(content);
    }

    @Override
	public void parse(String content) {

    }
}
