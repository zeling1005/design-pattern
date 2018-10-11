package com.zeling.dp.cor;

/**
 * 责任链客户端
 * 
 * @author chenbd 2018年10月11日
 */
public class Client {

	public static void main(String[] args) {
		HomeworkChain chain = new HomeworkChain();
		// 责任链的添加是有顺序的，家庭作业责任链：组长->班长->班主任
		chain.addNextHandler(new GroupLeaderHandler());
		chain.addNextHandler(new MonitorHandler());
		chain.addNextHandler(new HeadmasterHandler());
		// 进行处理
		chain.doNext();
	}

}
