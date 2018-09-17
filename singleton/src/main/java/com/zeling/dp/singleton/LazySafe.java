package com.zeling.dp.singleton;

/**
 * @description 线程安全的单例模式
 * @author zeling
 * @date 2018年1月24日 下午10:31:56 
 */
public class LazySafe {
    private static LazySafe instance;
    public synchronized static LazySafe getInstance() {
        if (instance == null) {
            instance = new LazySafe();
        }
        return instance;
    }
    private LazySafe() {}
}
