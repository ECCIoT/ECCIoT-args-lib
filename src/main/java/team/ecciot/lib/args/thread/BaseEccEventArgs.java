package team.ecciot.lib.args.thread;


public abstract class BaseEccEventArgs extends BaseEccArgs {
    public BaseEccEventArgs(String content){
        parse(content);
    }
    protected abstract void parse(String content);
}
