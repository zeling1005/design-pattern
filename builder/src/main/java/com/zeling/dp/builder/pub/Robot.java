package com.zeling.dp.builder.pub;

import lombok.Data;

/**
 * 机器人
 * 
 * @author chenbd 2018年9月6日
 */
@Data
public class Robot {
	// 通常需要用建造者模式构建的对象的属性都是很复杂的，这里只是demo，所以使用简单的String属性
	private String head;
	private String hand;
	private String foot;
	private String body;
	
	public Robot(String head, String hand, String body, String foot) {
		this.head = head;
		this.hand = hand;
		this.body = body;
		this.foot = foot;
	}
	
	public Robot() {
		
	}
}
