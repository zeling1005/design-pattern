package com.zeling.dp.observer;

/**
 * 观察者模式
 * 
 * @author chenbd 2018年10月8日
 */
public class ObserverTest {

	public static void main(String[] args) {
		FootballMatch footballMatch = new FootballMatch();
		// 添加几个看球的球迷
		footballMatch.addObserver(new FootballFan("Tom"));
		footballMatch.addObserver(new FootballFan("Lili"));
		// 进球了
		footballMatch.goal();
	}

}
