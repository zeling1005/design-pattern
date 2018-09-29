package com.zeling.dp.composite;

import com.zeling.dp.composite.base.AbsEmployer;

/**
 * 客户端
 * 
 * @author chenbd 2018年9月29日
 */
public class Client {

	public static void main(String[] args) {
		AbsEmployer lili = new ProjectManager("lili");
		AbsEmployer tom = new Programer("tom");
		AbsEmployer lina = new Programer("lina");
		// peter手下有两个程序员
		lili.add(tom);
		lili.add(lina);
		
		// 看看项目经理手下都有谁
		for (AbsEmployer employer : lili.getEmployers()) {
			System.out.println(employer.getName());
		}
	}

}
