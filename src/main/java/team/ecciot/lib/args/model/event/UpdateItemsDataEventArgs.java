package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_UpdateItemsData")
public class UpdateItemsDataEventArgs extends BaseEccEventArgs {
	
	public UpdateItemsDataEventArgs() {}
	public UpdateItemsDataEventArgs(String content) {
        super(content);
    }

    @Override
	public void parse(String content) {
    	
    }
}
