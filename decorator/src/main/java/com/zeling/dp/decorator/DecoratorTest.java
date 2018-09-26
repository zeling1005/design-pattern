package com.zeling.dp.decorator;

/**
 * 装饰器模式测试
 * 
 * @author chenbd 2018年9月26日
 */
public class DecoratorTest {

	public static void main(String[] args) {
		ICola iceCola = new IceCola(new CommonCola());
		iceCola.desc();
	}

}
