package com.zeling.dp.builder.normal;

import com.zeling.dp.builder.pub.Robot;

/**
 * 建造者接口
 * 
 * @author chenbd 2018年9月6日
 */
public interface IBuilder {
	/**
	 * 造头
	 */
	void setHead();
	
	/**
	 * 造手
	 */
	void setHand();
	
	/**
	 * 造身体
	 */
	void setBody();
	
	/**
	 * 造脚
	 */
	void setFoot();
	
	/**
	 * 造机器人
	 */
	Robot build();
}
