package com.zeling.dp.factory.af;

import com.zeling.dp.factory.pub.IHuman;
import com.zeling.dp.factory.pub.Woman;

/**
 * 平原工厂
 * 
 * @author chenbd 2018年9月11日
 */
public class PlainFactory implements IAbstractFactory {

	@Override
	public ISnake createSnake() {
		return new YellowSnake();
	}

	@Override
	public IHuman createHuman() {
		return new Woman();
	}

}
