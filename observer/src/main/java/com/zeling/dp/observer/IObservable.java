package com.zeling.dp.observer;

/**
 * 可观察接口
 * 
 * @author chenbd 2018年10月8日
 */
public interface IObservable {
	/**
	 * 添加观察者
	 * 
	 * @param observer
	 */
	public void addObserver(IObserver observer);
	
	/**
	 * 移出观察者
	 * 
	 * @param observer
	 */
	public void removeObserver(IObserver observer);
	
	/**
	 * 通知观察者
	 */
	public void notifyObservers();
}
