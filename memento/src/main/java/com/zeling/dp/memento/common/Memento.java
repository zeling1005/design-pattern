package com.zeling.dp.memento.common;

/**
 * 存储源对象状态
 * 
 * @author chenbd 2018年11月8日
 */
public class Memento {
	/**
	 * 源对象的内部状态
	 */
	private String state;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento(String state) {
		this.state = state;
	}
}
