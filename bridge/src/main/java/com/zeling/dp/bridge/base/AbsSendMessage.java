package com.zeling.dp.bridge.base;

/**
 * 抽象化角色：发送消息
 * 
 * @author chenbd 2018年9月28日
 */
public abstract class AbsSendMessage {
	private ISendMode sendMode;
	
	public AbsSendMessage(ISendMode sendMode) {
		this.sendMode = sendMode;
	}
	
	/**
	 * 发送消息
	 */
	public void send() {
		// 设置具体的发送方式
		setSendMode();
	}
	
	/**
	 * 将发送形式分离出去，保留一个方法获取分离出去的功能
	 */
	private void setSendMode() {
		sendMode.sendMode();
	}
}
