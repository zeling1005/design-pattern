package com.zeling.dp.singleton;

/**
 * @description 非线程安全的懒汉式单例
 * @author zeling
 * @date 2018年1月24日 下午10:27:22 
 */
public class LazyNoSafe {
    private static LazyNoSafe instance;
    public static LazyNoSafe getInstance() {
        if (instance == null) {
            instance = new LazyNoSafe();
        }
        return instance;
    }
    private LazyNoSafe() {}
}
