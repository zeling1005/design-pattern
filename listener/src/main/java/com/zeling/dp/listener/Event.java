package com.zeling.dp.listener;

/**
 * 事件对象，用于设置和获取事件源引用
 * 
 * @author chenbd 2018年9月17日
 */
public class Event {
	/**
	 * 事件源引用
	 */
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
