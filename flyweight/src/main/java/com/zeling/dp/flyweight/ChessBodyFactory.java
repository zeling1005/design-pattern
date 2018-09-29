package com.zeling.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ChessBody工厂，让相同颜色的ChessBody对象被共享，即同种颜色的对象只保留一个
 * 
 * @author chenbd 2018年9月29日
 */
public class ChessBodyFactory {
	private static Map<String, ChessBody> map = new HashMap<String, ChessBody>();
	
	public static ChessBody getChessBody(String color) {
		ChessBody chessBody = map.get(color);
		if (chessBody == null) {
			chessBody = new ChessBody(color);
			map.put(color, chessBody);
		}
		return chessBody;
	}
}
