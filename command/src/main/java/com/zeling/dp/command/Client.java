package com.zeling.dp.command;

/**
 * 客户端
 * 
 * @author chenbd 2018年10月23日
 */
public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		TurnOffTV turnOffCmd = new TurnOffTV(tv);
		TurnOnTV turnOnCmd = new TurnOnTV(tv);
		RemoteControl remoteControl = new RemoteControl(turnOnCmd, turnOffCmd);
		
		// 发送请求
		remoteControl.turnOn();
		
		remoteControl.turnOff();
	}

}
