package team.ecciot.lib.args.model.event;

import team.ecciot.lib.args.annotation.EventArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@EventArgsAnnotation(action = "EccEvent_Alarm")
public class AlarmEventArgs extends BaseEccEventArgs {

    public AlarmEventArgs(String content) {
        super(content);
    }

    @Override
    protected void parse(String content) {

    }
}
