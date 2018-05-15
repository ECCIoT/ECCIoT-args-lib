package team.ecciot.lib.args.model.impl;

import java.util.Date;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccArgs;

@ArgsAnnotation(action = "Server_UpdateItemsData")
public class UpdateItemsDataArgs extends BaseEccArgs {

	private JSONArray itemsData;
	private String date;
	
	public UpdateItemsDataArgs() {
		
	}

	public UpdateItemsDataArgs(String content) throws ParserException {
		super(content);
	}

	@Override
	public void parse(JSONObject content) {
		itemsData = content.getJSONArray("itemsData");
	}

	public JSONArray getItemsData() {
		return itemsData;
	}

	public void setItemsData(JSONArray itemsData) {
		this.itemsData = itemsData;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
