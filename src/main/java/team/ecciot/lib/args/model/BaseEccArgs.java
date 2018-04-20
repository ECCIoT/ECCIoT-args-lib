package team.ecciot.lib.args.model;

import com.alibaba.fastjson.JSON;

public abstract class BaseEccArgs {
	@Override
    public String toString()
    {
        return JSON.toJSONString(this);
    }
}
