package team.ecciot.lib.args.event;

import team.ecciot.lib.args.thread.BaseEccEventArgs;

public class APIKeyInvalidEventArgs extends BaseEccEventArgs {
    public APIKeyInvalidEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {

    }
}
