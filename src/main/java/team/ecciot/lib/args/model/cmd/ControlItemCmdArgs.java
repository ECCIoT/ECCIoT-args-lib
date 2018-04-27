package team.ecciot.lib.args.model.cmd;

import com.alibaba.fastjson.JSONObject;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.exception.ParserException;
import team.ecciot.lib.args.model.BaseEccCmdArgs;

@ArgsAnnotation(action = "EccCmd_ControlItem")
public class ControlItemCmdArgs extends BaseEccCmdArgs {
	
	
	private String itemID;
    private String atCmd;
    
    public ControlItemCmdArgs() {}
    public ControlItemCmdArgs(String content) throws ParserException {
		super(content);
	}
    
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getAtCmd() {
		return atCmd;
	}
	public void setAtCmd(String atCmd) {
		this.atCmd = atCmd;
	}
	@Override
	public void parse(JSONObject content) {
		itemID = content.getString("itemID");
		atCmd = content.getString("atCmd");
	}
}
