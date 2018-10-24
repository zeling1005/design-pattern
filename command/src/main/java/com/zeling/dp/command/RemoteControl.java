package com.zeling.dp.command;

/**
 * 请求发起者：遥控器
 * 
 * @author chenbd 2018年10月23日
 */
public class RemoteControl {
	private ICommand turnOnCmd;
	private ICommand turnOffCmd;
	
	public RemoteControl(ICommand turnOnCmd, ICommand turnOffCmd) {
		this.turnOffCmd = turnOffCmd;
		this.turnOnCmd = turnOnCmd;
	}
	
	public void turnOn() {
		turnOnCmd.execute();
	}
	
	public void turnOff() {
		turnOffCmd.execute();
	}
}
