package com.zeling.dp.factory.af;

import com.zeling.dp.factory.pub.IHuman;

/**
 * 抽象工厂接口
 * 
 * @author chenbd 2018年9月11日
 */
public interface IAbstractFactory {
	public ISnake createSnake();
	public IHuman createHuman();
}
