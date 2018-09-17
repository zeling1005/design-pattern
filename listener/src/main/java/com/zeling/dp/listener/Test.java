package com.zeling.dp.listener;

/**
 * 监听器模式测试
 * 
 * @author chenbd 2018年9月17日
 */
public class Test {
	public static void main(String[] args) {
		ReadListener readListener = new ReadListener();
		Student student = new Student();
		student.setReadListener(readListener);
		// 当执行这个方法时，会自动调用ReadListener.isReading()方法
		student.read();
	}
}
