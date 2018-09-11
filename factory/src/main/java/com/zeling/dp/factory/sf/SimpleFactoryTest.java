package com.zeling.dp.factory.sf;

import com.zeling.dp.factory.pub.IHuman;
import com.zeling.dp.factory.pub.Man;
import com.zeling.dp.factory.pub.Woman;
import com.zeling.dp.factory.sf.HumanFactory.HumanType;

/**
 * 简单工厂测试
 * 
 * @author chenbd 2018年9月7日
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {
		// 工厂1测试
		IHuman man = HumanFactory.createHuman(HumanType.MAN);
		man.say();
		IHuman woman = HumanFactory.createHuman(HumanType.WOMAN);
		woman.say();
		
		// 工厂2测试
		IHuman man2 = HumanFactory2.createHuman(Man.class);
		man2.say();
		IHuman woman2 = HumanFactory2.createHuman(Woman.class);
		woman2.say();
	}

}
