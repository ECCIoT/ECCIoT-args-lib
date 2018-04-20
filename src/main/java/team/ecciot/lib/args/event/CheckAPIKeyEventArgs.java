package team.ecciot.lib.args.event;

import team.ecciot.lib.args.thread.BaseEccEventArgs;

public class CheckAPIKeyEventArgs extends BaseEccEventArgs {
    public CheckAPIKeyEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {

    }
}
