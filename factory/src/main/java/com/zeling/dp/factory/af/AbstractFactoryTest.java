package com.zeling.dp.factory.af;

import com.zeling.dp.factory.pub.IHuman;

/**
 * 抽象工厂测试
 * 
 * @author chenbd 2018年9月11日
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		PlainFactory plainFactory = new PlainFactory();
		IHuman woman = plainFactory.createHuman();
		ISnake yellowSnake = plainFactory.createSnake();
		woman.say();
		yellowSnake.color();
		
		MountainFactory mountainFactory = new MountainFactory();
		IHuman man = mountainFactory.createHuman();
		ISnake blackSnake = mountainFactory.createSnake();
		man.say();
		blackSnake.color();
	}

}
