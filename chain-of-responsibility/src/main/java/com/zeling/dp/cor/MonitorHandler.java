package com.zeling.dp.cor;

/**
 * 班长处理者
 * 
 * @author chenbd 2018年10月11日
 */
public class MonitorHandler implements IHandler {

	@Override
	public void doHandle(IChain chain) {
		System.out.println("班长正在处理...");
		System.out.println("班长统计没交作业的同学，并将作业上交到班主任！");
		chain.doNext();
	}
}
