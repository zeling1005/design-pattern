package com.zeling.dp.builder.normal;

import com.zeling.dp.builder.pub.Robot;

/**
 * 测试类
 * 
 * @author chenbd 2018年9月6日
 */
public class BuilderTest {

	public static void main(String[] args) {
		IBuilder builder = new SuperRobotBuilder();
		Robot robot = new Director().constructRobot(builder);
		System.out.println(robot);
	}

}
