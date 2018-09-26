package com.zeling.dp.decorator;

/**
 * 抽象装饰器，继承需要装饰的接口并且持有该接口的引用
 * 
 * @author chenbd 2018年9月26日
 */
public abstract class AbsColaDecorator implements ICola {
	
	private ICola cola;
	
	public AbsColaDecorator(ICola cola) {
		this.cola = cola;
	}

	@Override
	public void desc() {
		cola.desc();
	}
}
