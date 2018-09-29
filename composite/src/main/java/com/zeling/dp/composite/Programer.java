package com.zeling.dp.composite;

import com.zeling.dp.composite.base.AbsEmployer;

/**
 * leaf角色
 * 
 * @author chenbd 2018年9月29日
 */
public class Programer extends AbsEmployer {

	public Programer(String name) {
		setName(name);
		// 没有下级了
		employers = null;
	}
	
	@Override
	public void add(AbsEmployer employer) {
		throw new RuntimeException("不能添加下级");
	}

	@Override
	public void delete(AbsEmployer employer) {
		throw new RuntimeException("没有下级可以删除");
	}

}
