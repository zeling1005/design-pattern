package com.zeling.dp.prototype;

/**
 * 原型客户端：中国，执行原型复制方法
 * 
 * @author chenbd 2018年9月17日
 */
public class China {
	public static Person makePerson(Person person) throws CloneNotSupportedException {
		return person.clone();
	}
}
