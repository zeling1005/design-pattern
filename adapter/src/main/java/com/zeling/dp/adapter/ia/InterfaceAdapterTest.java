package com.zeling.dp.adapter.ia;

/**
 * 接口适配器测试
 * 
 * @author chenbd 2018年9月26日
 */
public class InterfaceAdapterTest {

	public static void main(String[] args) {
		// 标准实现
		Robot sweep = new SweepRobot();
		sweep.sweep();
		// 另一种实现
		Robot high = new RobotAdapter() {
			@Override
			public void high() {
				System.out.println("我非常高！");
			}
		};
		high.high();
	}

}
