package com.zeling.dp.cor;

/**
 * 组长处理
 * 
 * @author chenbd 2018年10月11日
 */
public class GroupLeaderHandler implements IHandler {

	@Override
	public void doHandle(IChain chain) {
		System.out.println("组长正在处理...");
		System.out.println("收集同学的作业，并将作业交给班长！");
		chain.doNext();
	}
}
