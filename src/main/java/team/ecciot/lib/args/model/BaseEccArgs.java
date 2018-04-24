package team.ecciot.lib.args.model;

import com.alibaba.fastjson.JSON;

public abstract class BaseEccArgs {
	
	
	public BaseEccArgs(){}
	
	public BaseEccArgs(String content){
        parse(content);
    }
	
    public abstract void parse(String content);
    
	@Override
    public String toString()
    {
        return JSON.toJSONString(this);
    }
}
