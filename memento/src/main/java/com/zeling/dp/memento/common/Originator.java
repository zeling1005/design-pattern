package com.zeling.dp.memento.common;

/**
 * 源对象，也就是需要保存状态的类
 * 
 * @author chenbd 2018年11月8日
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		this.state = memento.getState();
	}
}
