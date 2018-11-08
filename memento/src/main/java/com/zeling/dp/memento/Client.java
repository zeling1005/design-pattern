package com.zeling.dp.memento;

import com.zeling.dp.memento.common.Caretaker;
import com.zeling.dp.memento.common.Originator;
import com.zeling.dp.memento.special.IMemento;

/**
 * 测试客户端
 * 
 * @author chenbd 2018年11月8日
 */
public class Client {
	public static void main(String[] args) {
//		common();
		special();
	}
	
	public static void common() {
		Originator originator = new Originator();
		originator.setState("吃饭");
		System.out.println(originator.getState());
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		// 散步
		originator.setState("散步");
		System.out.println(originator.getState());
		// 恢复
		originator.setMemento(caretaker.getMemento());
		System.out.println(originator.getState());
	}
	
	public static void special() {
		com.zeling.dp.memento.special.Originator originator = new com.zeling.dp.memento.special.Originator();
		originator.setState("吃饭");
		System.out.println(originator.getState());
		IMemento memento = originator.createMemento();
		// 散步
		originator.setState("散步");
		System.out.println(originator.getState());
		// 恢复
		originator.setMemento(memento);
		System.out.println(originator.getState());
		
	}
}
