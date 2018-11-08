package com.zeling.dp.visitor;

/**
 * 电脑组件接口
 * 
 * @author chenbd 2018年11月8日
 */
public interface IComputerComponent {
	void accept(ComputerVisitor visitor);
}
