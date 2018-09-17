package com.zeling.dp.strategy;

import com.zeling.dp.strategy.base.Fruit;

/**
 * @description 具体策略：苹果类
 * @author zeling
 * @date 2018年1月14日 下午3:04:17
 */
public class Apple implements Fruit {

    @Override
    public void price() {
        System.out.println("苹果的价格！");
    }
}
