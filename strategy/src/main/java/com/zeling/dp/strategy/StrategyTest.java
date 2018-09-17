package com.zeling.dp.strategy;

/**
 * 策略模式测试<br>
 * 策略环境角色中的策略可以由外界改变，而不是它本身
 * 
 * @author chenbd 2018年9月17日
 */
public class StrategyTest {

	public static void main(String[] args) {
		FruitPrice fruitPrice = new FruitPrice();
		// 卖苹果
		fruitPrice.setFruit(new Apple());
		// 苹果价格
		fruitPrice.printFruitPrice();
		
		// 后来转卖香蕉
		fruitPrice.setFruit(new Banana());
		// 香蕉价格
		fruitPrice.printFruitPrice();
	}

}
