package com.zeling.dp.builder.normal;

import com.zeling.dp.builder.pub.Robot;

/**
 * 高智商机器人建造者
 * 
 * @author chenbd 2018年9月6日
 */
public class SuperRobotBuilder implements IBuilder {
	/**
	 * Robot引用
	 */
	private Robot robot;
	
	public SuperRobotBuilder() {
		robot = new Robot();
	}

	@Override
	public void setHead() {
		robot.setHead("智商250");
	}

	@Override
	public void setHand() {
		robot.setHand("万能巧手");
	}

	@Override
	public void setBody() {
		robot.setBody("百毒不侵");
	}

	@Override
	public void setFoot() {
		robot.setFoot("日行千里");
	}

	@Override
	public Robot build() {
		return robot;
	}

}
