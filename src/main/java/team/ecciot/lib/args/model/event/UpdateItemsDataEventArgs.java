package team.ecciot.lib.args.model.event;

import java.util.HashMap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccEventArgs;

@ArgsAnnotation(action = "EccEvent_UpdateItemsData")
public class UpdateItemsDataEventArgs extends BaseEccEventArgs {
	
	private ItemData[] itemsData;
	
	public UpdateItemsDataEventArgs() {}
	public UpdateItemsDataEventArgs(String content) throws ParserException {
        super(content);
    }
	@Override
	public void parse(JSONObject content) {
		/*对应的C#代码
		//解析数据为Json数组
        JArray jarr = new JArray(content);
        //实例化数据集数组
        itemsData = new ItemData[jarr.Count];
        //遍历数据
        for (int i=0;i<jarr.Count;i++)
        {
            //按序获取数组元素
            JObject json = new JObject(jarr[i].ToString());
            //实例化项目数据对象
            itemsData[i] = new ItemData();
            //获取项目ID
            itemsData[i].itemID = json["itemID"].ToString();
            //获取属性表
            JArray jarrAb = new JArray(json["attribute"]);
            foreach (JObject jo in jarrAb)
            {
                itemsData[i].attribute.Add(jo["field"].ToString(), jo["value"].ToString());
            }
        }
        */
		//获取Json数组
		JSONArray jarr = content.getJSONArray("array");
		//实例化ItemData数组对象
		itemsData = new ItemData[jarr.size()];
		//遍历数据
		for(int i=0;i<jarr.size();i++){
			//按序获取数组元素
			JSONObject json = jarr.getJSONObject(i);
			//实例化项目数据对象
            itemsData[i] = new ItemData();
            //获取项目ID
            itemsData[i].itemID = json.getString("itemID");
            //获取属性表
            JSONArray jarrAb = json.getJSONArray("attribute");
            for(int j=0;j<jarrAb.size();j++){
            	JSONObject jsonTemp = jarrAb.getJSONObject(j);
            	itemsData[i].attribute.put(jsonTemp.getString("field"), jsonTemp.getString("value"));
            }
		}
	}
	
	public ItemData[] getItemsData() {
		return itemsData;
	}
	
	public class ItemData
    {
		private String itemID;
		private HashMap<String, String> attribute;
        
        public HashMap<String, String> getAttribute() {
			return attribute;
		}
        public void setAttribute(HashMap<String, String> attribute) {
			this.attribute = attribute;
		}
        
        public String getItemID() {
			return itemID;
		}
        public void setItemID(String itemID) {
			this.itemID = itemID;
		}
    }
}
