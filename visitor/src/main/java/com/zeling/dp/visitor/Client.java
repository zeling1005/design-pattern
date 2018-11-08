package com.zeling.dp.visitor;

public class Client {

	public static void main(String[] args) {
		ComputerVisitor visitor = new ComputerVisitor();
		Keyboard keyboard = new Keyboard();
		keyboard.accept(visitor );
		Mouse mouse = new Mouse();
		mouse.accept(visitor);
	}

}
