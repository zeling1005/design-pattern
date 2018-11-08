package com.zeling.dp.visitor;

/**
 * 电脑访问者
 * 
 * @author chenbd 2018年11月8日
 */
public class ComputerVisitor {
	/**
	 * 访问鼠标
	 * 
	 * @param mouse
	 */
	public void visit(Mouse mouse) {
		mouse.move();
	}
	
	/**
	 * 访问键盘
	 * 
	 * @param keyboard
	 */
	public void visit(Keyboard keyboard) {
		keyboard.typing();
	}
}
