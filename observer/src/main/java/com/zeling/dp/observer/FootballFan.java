package com.zeling.dp.observer;

/**
 * 具体观察者：足球迷
 * 
 * @author chenbd 2018年10月8日
 */
public class FootballFan implements IObserver {
	private String name;
	
	public FootballFan(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println(name + "正在欢呼！！！");
	}

}
