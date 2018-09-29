package com.zeling.dp.flyweight;

/**
 * 测试
 * 
 * @author chenbd 2018年9月29日
 */
public class Client {

	public static void main(String[] args) {
		Chess black = new Chess(ChessBodyFactory.getChessBody("black"));
//		Chess white = new Chess(ChessBodyFactory.getChessBody("white"));
		Chess black2 = new Chess(ChessBodyFactory.getChessBody("black"));
		// 看看两个黑色的棋用了几个ChessBody
		if (black.getChessBody() == black2.getChessBody()) {
			System.out.println("两个黑色的棋只用了一个ChessBody!");
		} else {
			System.out.println("两个黑色的棋用了两个ChessBody!");
		}
	}
}
