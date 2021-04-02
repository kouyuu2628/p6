package com.p6.designpattern.singletonpattern.lazy;

/**
 * 优点：写法优雅，利用了Java本身的语法特点，性能高，避免了内存浪费
 * 缺点：能够被反射破坏，不支持传参
 *
 * @author huangyong
 * @date 2021/3/28 22:36
 **/
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        // 解决被反射破坏的方案
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("禁止非法访问");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        // 静态成员变量在类加载时初始化，静态内部类只有在被调用时才初始化。利用这个特效，实现延迟加载。
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
