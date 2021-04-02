package com.p6.designpattern.singletonpattern.hungry;

/**
 * 优点：执行效率高，性能高，没有任何锁
 * 缺点：某些情况下，可能会造成内容浪费
 *
 * @author huangyong
 * @date 2021/3/28 21:32
 **/
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
