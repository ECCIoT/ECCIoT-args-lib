package team.ecciot.lib.args.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.exception.ParserException;

public abstract class BaseEccArgs {

	public BaseEccArgs(){}
	
	public BaseEccArgs(String content) throws ParserException{
        parse(castString2Json(content));
    }
	
	public BaseEccArgs(JSONObject content) throws ParserException{
        parse(content);
    }
	
    public abstract void parse(JSONObject content);
    
	@Override
    public String toString()
    {
        return JSON.toJSONString(this);
    }
	
	public static JSONObject castString2Json(String contnet) throws ParserException{
		try{
			return JSON.parseObject(contnet);
		}catch (JSONException e) {
			throw new ParserException();
		}
	}
}
