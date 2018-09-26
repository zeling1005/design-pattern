package com.zeling.dp.decorator;

/**
 * 具体的装饰器：冰可乐
 * 
 * @author chenbd 2018年9月26日
 */
public class IceCola extends AbsColaDecorator {

	public IceCola(ICola cola) {
		super(cola);
	}
	
	private void addIce() {
		System.out.println("加冰...");
	}

	@Override
	public void desc() {
		// 执行原有的方法
		super.desc();
		// 装饰：加冰
		addIce();
	}
	
}
