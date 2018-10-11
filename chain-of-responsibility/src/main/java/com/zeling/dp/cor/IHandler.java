package com.zeling.dp.cor;

/**
 * 责任链中的处理接口
 * 
 * @author chenbd 2018年10月11日
 */
public interface IHandler {
	/**
	 * 处理任务
	 * 
	 * @param chain
	 */
	public void doHandle(IChain chain);
}
