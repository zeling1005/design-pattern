package com.zeling.dp.factory.fm;

import com.zeling.dp.factory.pub.IHuman;

/**
 * 工厂方法测试
 * 
 * @author chenbd 2018年9月11日
 */
public class FactoryMethodTest {

	public static void main(String[] args) {
		ManFactory manFactory = new ManFactory();
		IHuman man = manFactory.createHuman();
		man.say();
		WomanFactory womanFactory = new WomanFactory();
		IHuman woman = womanFactory.createHuman();
		woman.say();
	}

}
