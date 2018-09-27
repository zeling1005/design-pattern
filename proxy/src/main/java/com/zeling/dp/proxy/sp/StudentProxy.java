package com.zeling.dp.proxy.sp;

import com.zeling.dp.proxy.pub.IStudent;

/**
 * 学生代理
 * 
 * @author chenbd 2018年9月27日
 */
public class StudentProxy implements IStudent {

	private IStudent student;
	
	public StudentProxy(IStudent student) {
		this.student = student;
	}
	
	private void summary() {
		System.out.println("总结与思考");
	}
	
	@Override
	public void study() {
		student.study();
		summary();
	}

}
