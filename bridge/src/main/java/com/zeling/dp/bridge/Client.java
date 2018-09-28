package com.zeling.dp.bridge;

import com.zeling.dp.bridge.base.AbsSendMessage;
import com.zeling.dp.bridge.base.ISendMode;
import com.zeling.dp.bridge.msgtype.CommonMessage;
import com.zeling.dp.bridge.msgtype.UrgencyMessage;
import com.zeling.dp.bridge.sendmode.EmailMode;
import com.zeling.dp.bridge.sendmode.ShortMode;

/**
 * 客户端
 * 
 * @author chenbd 2018年9月28日
 */
public class Client {

	public static void main(String[] args) {
		// 使用短信发送普通消息
		ISendMode shortMode = new ShortMode();
		AbsSendMessage common = new CommonMessage(shortMode);
		common.send();
		// 使用短信发送加急消息
		AbsSendMessage urgency = new UrgencyMessage(shortMode);
		urgency.send();
		
		// 使用邮件发送普通信息
		ISendMode emailMode = new EmailMode();
		AbsSendMessage commonEmail = new CommonMessage(emailMode);
		commonEmail.send();
	}

}
