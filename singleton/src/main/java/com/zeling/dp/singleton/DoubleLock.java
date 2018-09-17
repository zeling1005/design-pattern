package com.zeling.dp.singleton;

/**
 * @description 双重锁机制
 * @author zeling
 * @date 2018年1月24日 下午10:46:49 
 */
public class DoubleLock {
    private volatile static DoubleLock instance;
    public static DoubleLock getInstance() {
        if (instance == null) {
            synchronized(DoubleLock.class) {
                if (instance == null) {
                    instance = new DoubleLock();
                }
            }
        }
        return instance;
    }
    private DoubleLock() {}
}
