package com.zeling.dp.strategy;

import com.zeling.dp.strategy.base.Fruit;

/**
 * @description 策略环境角色：输出水果价格
 * @author zeling
 * @date 2018年1月14日 下午3:09:31
 */
public class FruitPrice {

    /**
     * 策略对象
     */
    private Fruit fruit;

    /**
     * @param fruit 策略对象
     */
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
    
    /**
     * @description 输出水果价格
     * @date 2018年1月14日 下午3:12:26
     */
    public void printFruitPrice() {
        fruit.price();
    }
}
