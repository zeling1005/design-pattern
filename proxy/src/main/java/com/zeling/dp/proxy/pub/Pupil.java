package com.zeling.dp.proxy.pub;

/**
 * 小学生
 * 
 * @author chenbd 2018年9月27日
 */
public class Pupil implements IStudent {

	@Override
	public void study() {
		System.out.println("学习...");
	}

}
