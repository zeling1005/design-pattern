package com.zeling.dp.builder.special;

import lombok.Data;

/**
 * 使用一个类实现的建造者模式
 * 
 * @author chenbd 2018年9月6日
 */
@Data
public class SpecialRobot {
	// 通常需要用建造者模式构建的对象的属性都是很复杂的，这里只是demo，所以使用简单的String属性
	private String head;
	private String hand;
	private String foot;
	private String body;
	
	public SpecialRobot(String head, String hand, String body, String foot) {
		this.head = head;
		this.hand = hand;
		this.body = body;
		this.foot = foot;
	}
	
	/**
	 * 获取建造者
	 * 
	 * @return
	 */
	public static Builder getBuilder() {
		return new Builder();
	}
	
	/**
	 * 建造者
	 * 
	 * @author chenbd 2018年9月6日
	 */
	public static class Builder {
		private String head;
		private String hand;
		private String body;
		private String foot;
		
		Builder setHead(String head) {
			this.head = head;
			return this;
		}
		Builder setHand(String hand) {
			this.hand = hand;
			return this;
		}
		Builder setBody(String body) {
			this.body = body;
			return this;
		}
		Builder setFoot(String foot) {
			this.foot = foot;
			return this;
		}
		SpecialRobot build() {
			return new SpecialRobot(head, hand, body, foot);
		}
	}
}
