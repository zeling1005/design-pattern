package com.zeling.dp.state;

import com.zeling.dp.state.base.Orange;

/**
 * @description 状态2：青色的橘子
 * @author zeling
 * @date 2018年1月14日 下午4:17:52
 */
public class CyanOrange implements Orange {

    @Override
    public void printColor() {
        System.out.println("My color is cyan!");
    }
}
