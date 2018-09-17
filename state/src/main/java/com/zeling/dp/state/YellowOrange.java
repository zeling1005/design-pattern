package com.zeling.dp.state;

import com.zeling.dp.state.base.Orange;

/**
 * @description 状态3：黄色的橘子
 * @author zeling
 * @date 2018年1月14日 下午4:18:45
 */
public class YellowOrange implements Orange {

    @Override
    public void printColor() {
        System.out.println("My color is yellow!");
    }
}
