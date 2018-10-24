package com.zeling.dp.command;

/**
 * 具体命令：关闭电视命令
 * 
 * @author chenbd 2018年10月23日
 */
public class TurnOffTV implements ICommand {
	private TV tv;

	public TurnOffTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOff();
	}

}