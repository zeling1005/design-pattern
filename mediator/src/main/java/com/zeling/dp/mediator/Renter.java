package com.zeling.dp.mediator;

/**
 * 求租者
 * 
 * @author chenbd 2018年11月8日
 */
public class Renter extends AbsPerson {

	public Renter(String name) {
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
		System.out.println("求租者[" + name + "]收到中介发来的消息： " + msg);
	}

}
