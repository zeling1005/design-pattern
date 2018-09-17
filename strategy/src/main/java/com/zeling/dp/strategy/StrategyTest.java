package com.zeling.dp.strategy;

import com.zeling.dp.strategy.base.Fruit;

/**
 * 策略模式测试
 * 
 * @author chenbd 2018年9月17日
 */
public class StrategyTest {

	public static void main(String[] args) {
		// 具体使用策略
        Fruit apple = new Apple();
        // 将策略放入环境中并执行策略
        new FruitPrice(apple).printFruitPrice();
	}

}
