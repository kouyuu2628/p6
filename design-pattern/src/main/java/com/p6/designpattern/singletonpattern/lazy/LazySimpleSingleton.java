package com.p6.designpattern.singletonpattern.lazy;

/**
 * 优点：节省了内存
 * 缺点：线程不安全
 *
 * @author huangyong
 * @date 2021/3/28 22:01
 **/
public class LazySimpleSingleton {

    public static LazySimpleSingleton instance;

    private LazySimpleSingleton() {}

    public static LazySimpleSingleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
