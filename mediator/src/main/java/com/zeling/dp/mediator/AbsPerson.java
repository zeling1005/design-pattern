package com.zeling.dp.mediator;

/**
 * 抽象同事类
 * 
 * @author chenbd 2018年11月8日
 */
public abstract class AbsPerson {
	/**
	 * 名称
	 */
	protected String name;
	/**
	 * 中介者引用
	 */
	protected AbsMediator mediator;
	
	public AbsPerson(String name) {
		this.name = name;
	}
	
	public void setMediator(AbsMediator mediator) {
		this.mediator = mediator;
	}
	
	/**
	 * 发送消息给中介者
	 * 
	 * @param msg
	 */
	protected abstract void sendMsg(String msg);
	
	/**
	 * 从中介者中获取消息
	 * 
	 * @param msg
	 */
	protected abstract void getMsg(String msg);
}
