package com.zeling.dp.factory.fm;

import com.zeling.dp.factory.pub.IHuman;
import com.zeling.dp.factory.pub.Woman;

/**
 * 女人工厂类
 * 
 * @author chenbd 2018年9月11日
 */
public class WomanFactory implements IHumanFactory {

	@Override
	public IHuman createHuman() {
		return new Woman();
	}

}
