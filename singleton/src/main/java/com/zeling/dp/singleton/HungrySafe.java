package com.zeling.dp.singleton;

/**
 * @description 饿汉式
 * @author zeling
 * @date 2018年1月24日 下午10:51:03 
 */
public class HungrySafe {
    private static HungrySafe instance = new HungrySafe();
    public static HungrySafe getInstance() {
        return instance;
    }
    private HungrySafe() {}
}
