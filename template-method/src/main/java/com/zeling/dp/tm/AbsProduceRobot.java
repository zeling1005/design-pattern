package com.zeling.dp.tm;

/**
 * 生产机器人
 * 
 * @author chenbd 2018年9月29日
 */
public abstract class AbsProduceRobot {
	
	// 制造机器人的各个方法，留给子类实现
	public abstract void createHead();
	public abstract void createHand();
	public abstract void createBody();
	public abstract void createFoot();
	
	/**
	 * 模板方法：子类使用这个方法制造机器人
	 */
	public final void produceRobot() {
		createHead();
		createHand();
		createBody();
		createFoot();
		System.out.println("机器人制造完成！");
	}
}
