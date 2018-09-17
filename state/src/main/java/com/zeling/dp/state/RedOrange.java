package com.zeling.dp.state;

import com.zeling.dp.state.base.Orange;

/**
 * @description 状态1：红色外观的橘子
 * @author zeling
 * @date 2018年1月14日 下午4:15:29
 */
public class RedOrange implements Orange {

    @Override
    public void printColor() {
        System.out.println("My color is red!");
    }
}
