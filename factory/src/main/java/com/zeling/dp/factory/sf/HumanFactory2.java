package com.zeling.dp.factory.sf;

/**
 * 人类工厂类2
 * 
 * @author chenbd 2018年9月7日
 */
public class HumanFactory2 {

	public static IHuman createHuman(Class<?> clazz) {
		try {
			return (IHuman) clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("实例化Human出错");
			return null;
		}
	}
}
