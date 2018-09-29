package com.zeling.dp.composite.base;

import java.util.List;

/**
 * component角色
 * 
 * @author chenbd 2018年9月29日
 */
public abstract class AbsEmployer {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void add(AbsEmployer employer);
	
	public abstract void delete(AbsEmployer employer);
	
	public void printName() {
		System.out.println(name);
	}
	
	protected List<AbsEmployer> employers;
	
	public List<AbsEmployer> getEmployers() {
		return this.employers;
	}
}
