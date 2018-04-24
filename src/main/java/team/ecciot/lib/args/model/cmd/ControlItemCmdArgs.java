package team.ecciot.lib.args.model.cmd;

import team.ecciot.lib.args.annotation.ArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccCmdArgs;

@ArgsAnnotation(action = "EccCmd_ControlItem")
public class ControlItemCmdArgs extends BaseEccCmdArgs {
	
	
	private String itemID;
    private String atCmd;
    
    public ControlItemCmdArgs() {}
    public ControlItemCmdArgs(String content) {
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
	public void parse(String content) {
		
	}
}