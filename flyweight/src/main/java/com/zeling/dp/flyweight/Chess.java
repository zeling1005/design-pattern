package com.zeling.dp.flyweight;

/**
 * 棋
 * 
 * @author chenbd 2018年9月29日
 */
public class Chess {
	/**
	 * 棋的主体，不变部分
	 */
	private ChessBody chessBody;
	/**
	 * 棋的序号，可变部分
	 */
	private String num;
	
	public Chess(ChessBody chessBody) {
		this.chessBody = chessBody;
	}
	
	public ChessBody getChessBody() {
		return chessBody;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
}
