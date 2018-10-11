package com.zeling.dp.cor;

/**
 * 班主任处理
 * 
 * @author chenbd 2018年10月11日
 */
public class HeadmasterHandler implements IHandler {

	@Override
	public void doHandle(IChain chain) {
		System.out.println("班主任正在处理...");
		System.out.println("班主任批改作业！");
		chain.doNext();
	}
}
