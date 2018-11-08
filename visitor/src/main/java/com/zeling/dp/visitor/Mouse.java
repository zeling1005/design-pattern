package com.zeling.dp.visitor;

/**
 * 我是鼠标
 * 
 * @author chenbd 2018年11月8日
 */
public class Mouse implements IComputerComponent {
	public void move() {
		System.out.println("我是鼠标，我经常被移动。");
	}

	@Override
	public void accept(ComputerVisitor visitor) {
		visitor.visit(this);
	}
}
