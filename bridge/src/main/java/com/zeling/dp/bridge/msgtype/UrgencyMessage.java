package com.zeling.dp.bridge.msgtype;

import com.zeling.dp.bridge.base.AbsSendMessage;
import com.zeling.dp.bridge.base.ISendMode;

/**
 * 加急消息
 * 
 * @author chenbd 2018年9月28日
 */
public class UrgencyMessage extends AbsSendMessage {

	public UrgencyMessage(ISendMode sendMode) {
		super(sendMode);
	}
	
	@Override
	public void send() {
		super.send();
		System.out.println("加急消息...");
	}
	
	/**
	 * 扩展功能，添加自己的方法
	 */
	public void watch() {
		System.out.println("添加监控...");
	}

}
