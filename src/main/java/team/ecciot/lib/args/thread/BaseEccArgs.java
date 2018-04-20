package team.ecciot.lib.args.thread;

import com.alibaba.fastjson.JSON;

public abstract class BaseEccArgs {
	@Override
    public String toString()
    {
        return JSON.toJSONString(this);
    }
}
