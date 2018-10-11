package com.zeling.dp.cor;

/**
 * 责任链接口
 * 
 * @author chenbd 2018年10月11日
 */
public interface IChain {
	/**
	 * 进行下一个处理
	 */
	public void doNext();
}
