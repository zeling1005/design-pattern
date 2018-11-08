package com.zeling.dp.mediator;

/**
 * 房东
 * 
 * @author chenbd 2018年11月8日
 */
public class Landlord extends AbsPerson {

	public Landlord(String name) {
		super(name);
	}

	@Override
	protected void sendMsg(String msg) {
		if (mediator != null) {
			mediator.operation(this, msg);
		}
	}

	@Override
	protected void getMsg(String msg) {
		System.out.println("房东["+ name +"]收到中介发来的消息：" + msg);
	}
}
