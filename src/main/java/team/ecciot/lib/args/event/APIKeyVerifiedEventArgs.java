package team.ecciot.lib.args.event;

import team.ecciot.lib.args.thread.BaseEccEventArgs;

public class APIKeyVerifiedEventArgs extends BaseEccEventArgs {
    public APIKeyVerifiedEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {

    }
}
