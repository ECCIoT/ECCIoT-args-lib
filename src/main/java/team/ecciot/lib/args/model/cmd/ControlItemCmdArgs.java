package team.ecciot.lib.args.model.cmd;

import team.ecciot.lib.args.annotation.CmdArgsAnnotation;
import team.ecciot.lib.args.model.BaseEccCmdArgs;

@CmdArgsAnnotation(action = "EccCmd_ControlItem")
public class ControlItemCmdArgs extends BaseEccCmdArgs {
	private String itemID;
    private String atCmd;
    
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
}
