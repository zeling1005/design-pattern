package com.zeling.dp.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的原型对象，实现复制方法
 * 
 * @author chenbd 2018年9月17日
 */
public class Chinese implements Person {
	private String name;
	private Integer age;
	private List<String> properties;
	
	@Override
	public Chinese clone() {
		Chinese clone = null;
		try {
			clone = (Chinese) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
		if (properties == null) {
			return clone;
		}
		List<String> cloneProperties = new ArrayList<>();
		for (String property : properties) {
			cloneProperties.add(property);
		}
		clone.setProperties(cloneProperties);
		return clone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<String> getProperties() {
		return properties;
	}
	public void setProperties(List<String> properties) {
		this.properties = properties;
	}
	
}
