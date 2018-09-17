package com.zeling.dp.prototype;

/**
 * 原型接口，声明复制方法
 * 
 * @author chenbd 2018年9月17日
 */
public interface Person extends Cloneable {
	Person clone() throws CloneNotSupportedException;
}
