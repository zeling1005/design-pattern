package com.zeling.dp.strategy;

import com.zeling.dp.strategy.base.Fruit;

/**
 * @description 具体策略：香蕉
 * @author zeling
 * @date 2018年1月14日 下午3:06:52
 */
public class Banana implements Fruit {

    @Override
    public void price() {
        System.out.println("香蕉的价格！");
    }
}
