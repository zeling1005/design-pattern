package com.zeling.dp.builder.normal;

import com.zeling.dp.builder.pub.Robot;

/**
 * 指导者，处理建造过程
 * 
 * @author chenbd 2018年9月6日
 */
public class Director {
	/**
	 * 造机器人
	 * 
	 * @param builder
	 * @return
	 */
	public Robot constructRobot(IBuilder builder) {
		builder.setHead();
		builder.setHand();
		builder.setBody();
		builder.setFoot();
		return builder.build();
	}
}
