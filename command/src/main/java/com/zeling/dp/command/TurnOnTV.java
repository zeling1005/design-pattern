package com.zeling.dp.command;

/**
 * 具体命令：打开电视命令
 * 
 * @author chenbd 2018年10月23日
 */
public class TurnOnTV implements ICommand {
	private TV tv;
	
	public TurnOnTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOn();
	}

}
