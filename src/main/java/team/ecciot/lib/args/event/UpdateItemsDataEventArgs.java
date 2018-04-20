package team.ecciot.lib.args.event;

import team.ecciot.lib.args.thread.BaseEccEventArgs;

public class UpdateItemsDataEventArgs extends BaseEccEventArgs {
    public UpdateItemsDataEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {
    	
    }
}
