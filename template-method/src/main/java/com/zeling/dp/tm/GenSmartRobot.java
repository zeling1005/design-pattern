package com.zeling.dp.tm;

/**
 * 生产聪明的机器人
 * 
 * @author chenbd 2018年9月29日
 */
public class GenSmartRobot extends AbsProduceRobot {

	@Override
	public void createHead() {
		System.out.println("制造智商250的头脑");
	}

	@Override
	public void createHand() {
		System.out.println("制造万能巧手");
	}

	@Override
	public void createBody() {
		System.out.println("制造金刚不坏的躯体");
	}

	@Override
	public void createFoot() {
		System.out.println("制造千里足");
	}

}
