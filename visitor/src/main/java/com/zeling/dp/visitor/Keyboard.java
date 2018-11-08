package com.zeling.dp.visitor;

/**
 * 键盘
 * 
 * @author chenbd 2018年11月8日
 */
public class Keyboard implements IComputerComponent {
	public void typing() {
		System.out.println("我是键盘，我可以用于打字");
	}

	@Override
	public void accept(ComputerVisitor visitor) {
		visitor.visit(this);
	}
}
