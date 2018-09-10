package com.zeling.dp.builder.special;

/**
 * 测试
 * 
 * @author chenbd 2018年9月6日
 */
public class SpecialBuilderTest {

	public static void main(String[] args) {
		SpecialRobot robot = SpecialRobot.getBuilder()
				.setHead("head")
				.setHand("hand")
				.setBody("body")
				.setFoot("foot")
				.build();
		System.out.println(robot);
	}

}
