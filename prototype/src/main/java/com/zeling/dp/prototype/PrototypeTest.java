package com.zeling.dp.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式：对象创建型模式，它采取复制原型对象的方法来创建对象的实例<br>
 * 当直接创建对象的代价比较大时，则采用这种模式
 * 原型模式测试
 * 
 * @author chenbd 2018年9月17日
 */
public class PrototypeTest {

	public static void main(String[] args) {
		List<String> properties = new ArrayList<>();
		properties.add("one");
		properties.add("two");
		Person person = new Chinese();
		System.out.println("person:" + person);
		// 通过复制获取一个全新的对象
		try {
			Person chinese = China.makePerson(person);
			System.out.println("chinese:" + chinese);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
