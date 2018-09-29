package com.zeling.dp.flyweight;

/**
 * 棋的主体，外界的变化不会改变的部分
 * 
 * @author chenbd 2018年9月29日
 */
public class ChessBody {
	
	public ChessBody(String color) {
		this.color = color;
	}
	
	private String color;
	
	public String getColor() {
		return color;
	}
}
