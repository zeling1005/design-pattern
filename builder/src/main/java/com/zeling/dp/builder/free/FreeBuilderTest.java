package com.zeling.dp.builder.free;

import com.zeling.dp.builder.pub.Robot;

/**
 * 测试
 * 
 * @author chenbd 2018年9月6日
 */
public class FreeBuilderTest {

	public static void main(String[] args) {
		// 这一步相当于指导者
		Robot robot = ConcreteFreeBuilder.getBuilder()
				.setHead("头")
				.setHand("手")
				.setBody("身体")
				.setFoot("脚")
				.build();
		System.out.println(robot);
	}

}
