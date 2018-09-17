package com.zeling.dp.listener;

/**
 * 事件监听器接口
 * 
 * @author chenbd 2018年9月17日
 */
public interface Listener {
	/**
	 * 读书事件，通过事件对象引用，获取事件源的引用，然后就可以对事件源进行操作
	 * 
	 * @param event 事件对象引用
	 */
	public void isReading(Event event);
}
