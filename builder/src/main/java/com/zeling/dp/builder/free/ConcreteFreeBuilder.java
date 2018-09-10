package com.zeling.dp.builder.free;

import com.zeling.dp.builder.pub.Robot;

/**
 * 自由的建造者实现
 * 
 * @author chenbd 2018年9月6日
 */
public class ConcreteFreeBuilder implements IFreeBuilder {
	private String head;
	private String hand;
	private String body;
	private String foot;
	
	/**
	 * 获取建造者实例
	 * 
	 * @return
	 */
	public static ConcreteFreeBuilder getBuilder() {
		return new ConcreteFreeBuilder();
	}

	@Override
	public IFreeBuilder setHead(String head) {
		this.head = head;
		return this;
	}

	@Override
	public IFreeBuilder setHand(String hand) {
		this.hand = hand;
		return this;
	}

	@Override
	public IFreeBuilder setBody(String body) {
		this.body = body;
		return this;
	}

	@Override
	public IFreeBuilder setFoot(String foot) {
		this.foot = foot;
		return this;
	}
	
	@Override
	public Robot build() {
		Robot robot = new Robot(head, hand, body, foot);
		return robot;
	}

}
