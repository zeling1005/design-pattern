package com.zeling.dp.bridge.msgtype;

import com.zeling.dp.bridge.base.AbsSendMessage;
import com.zeling.dp.bridge.base.ISendMode;

/**
 * 普通消息
 * 
 * @author chenbd 2018年9月28日
 */
public class CommonMessage extends AbsSendMessage {

	public CommonMessage(ISendMode sendMode) {
		super(sendMode);
	}
	
	@Override
	public void send() {
		super.send();
		System.out.println("发送普通消息");
	}

}
