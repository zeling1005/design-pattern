package com.zeling.dp.listener;

/**
 * 事件源
 * 
 * @author chenbd 2018年9月17日
 */
public class Student {
	
	/**
	 * 监听器引用
	 */
	private Listener listener;
	
	/**
	 * 设置监听器
	 * 
	 * @param listener 监听器
	 */
	public void setReadListener(Listener listener) {
		this.listener = listener;
	}
	
	/**
	 * 读书，这里触发正在读书的事件
	 */
	public void read() {
		if (listener != null) {
			Event event = new Event();
			event.setStudent(this);
			// 正在读书
			listener.isReading(event);
		}
	}
}
