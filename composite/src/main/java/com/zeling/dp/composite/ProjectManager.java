package com.zeling.dp.composite;

import java.util.ArrayList;

import com.zeling.dp.composite.base.AbsEmployer;

/**
 * composite角色
 * 
 * @author chenbd 2018年9月29日
 */
public class ProjectManager extends AbsEmployer {
	
	public ProjectManager(String name) {
		setName(name);
		employers = new ArrayList<AbsEmployer>();
	}

	@Override
	public void add(AbsEmployer employer) {
		employers.add(employer);
	}

	@Override
	public void delete(AbsEmployer employer) {
		employers.remove(employer);
	}

}
