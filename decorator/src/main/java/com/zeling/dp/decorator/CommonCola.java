package com.zeling.dp.decorator;

/**
 * 普通的可乐
 * 
 * @author chenbd 2018年9月26日
 */
public class CommonCola implements ICola {

	@Override
	public void desc() {
		System.out.println("我是普通的可乐！");
	}

}
