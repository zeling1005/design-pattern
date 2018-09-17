package com.zeling.dp.state;

import com.zeling.dp.state.base.Orange;

/**
 * @description 环境角色类：橘子状态管理器
 * @author zeling
 * @date 2018年1月14日 下午4:19:55
 */
public class OrangeStateManage {

    /**
     * 橘子的状态
     */
    private Orange state;

    /**
     * @description 设置橘子的状态
     * @date 2018年1月14日 下午4:21:36
     * @param state
     */
    public void setState(Orange state) {
        this.state = state;
    }

    /**
     * @description 输出当前状态的橘子颜色
     * @date 2018年1月14日 下午4:22:08
     */
    public void print() {
        state.printColor();
    }
}
