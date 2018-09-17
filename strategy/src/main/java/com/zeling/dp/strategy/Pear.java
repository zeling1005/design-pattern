package com.zeling.dp.strategy;

import com.zeling.dp.strategy.base.Fruit;

/**
 * @description 具体策略：梨
 * @author zeling
 * @date 2018年1月14日 下午3:08:19
 */
public class Pear implements Fruit {

    @Override
    public void price() {
        System.out.println("梨的价格！");
    }
}
