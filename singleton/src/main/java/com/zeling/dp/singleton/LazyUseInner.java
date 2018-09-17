package com.zeling.dp.singleton;

/**
 * @description 静态内部类实现方式
 * @author zeling
 * @date 2018年1月24日 下午10:36:40 
 */
public class LazyUseInner {
    private static class InnerClass {
        private static LazyUseInner instance = new LazyUseInner();
    }
    public static LazyUseInner getInstance() {
        return InnerClass.instance;
    }
    private LazyUseInner() {}
}
