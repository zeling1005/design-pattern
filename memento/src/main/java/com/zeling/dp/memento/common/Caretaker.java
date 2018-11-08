package com.zeling.dp.memento.common;

/**
 * 负责保存备忘录
 * 
 * @author chenbd 2018年11月8日
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
