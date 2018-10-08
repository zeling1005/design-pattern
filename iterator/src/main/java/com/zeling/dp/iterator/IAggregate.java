package com.zeling.dp.iterator;

/**
 * 容器接口
 * 
 * @author chenbd 2018年10月8日
 */
public interface IAggregate {
	public void add(Object o);
	public void removeLast();
	public Object get(int i);
	public IIterator iterator();
}
