package com.zeling.dp.listener;

/**
 * 真正的监听器
 * 
 * @author chenbd 2018年9月17日
 */
public class ReadListener implements Listener {

	@Override
	public void isReading(Event event) {
		// 使用 event.getStudent()方法获取事件源的引用，然后执行相关操作
		System.out.println("正在读书...");
	}

}
