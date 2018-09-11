package com.zeling.dp.factory.af;

import com.zeling.dp.factory.pub.IHuman;
import com.zeling.dp.factory.pub.Man;

/**
 * 山地工厂
 * 
 * @author chenbd 2018年9月11日
 */
public class MountainFactory implements IAbstractFactory {

	@Override
	public ISnake createSnake() {
		return new BlackSnake();
	}

	@Override
	public IHuman createHuman() {
		return new Man();
	}

}
