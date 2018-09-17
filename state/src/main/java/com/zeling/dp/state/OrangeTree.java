package com.zeling.dp.state;

import com.zeling.dp.state.base.Orange;

/**
 * @description 环境角色类：橘子树
 * @author zeling
 * @date 2018年1月14日 下午4:19:55
 */
public class OrangeTree {

    /**
     * 橘子的状态
     */
    private Orange state;
    
    public OrangeTree() {
    	state = new CyanOrange();
    }

    /**
     * @description 状态改变，这个改变是由橘子树（环境角色类）本身改变的，外界不能主动改变
     * @date 2018年1月14日 下午4:21:36
     * @param state
     */
    private void changeState(Orange state) {
        this.state = state;
    }

    /**
     * @description 输出当前状态的橘子颜色
     * @date 2018年1月14日 下午4:22:08
     */
    public void see() {
        state.color();
    }
    
    /**
     * 一段时间之后，橘子成熟了
     */
    public void inTime() {
    	System.out.println("in time ...");
    	changeState(new YellowOrange());
    }
}
