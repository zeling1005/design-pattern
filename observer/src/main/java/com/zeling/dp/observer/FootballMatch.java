package com.zeling.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的可观察者：足球比赛
 * 
 * @author chenbd 2018年10月8日
 */
public class FootballMatch implements IObservable {
	
	private List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void addObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update();
		}
	}
	
	public void goal() {
		System.out.println("球队进球了！！！");
		// 通知
		notifyObservers();
	}

}
