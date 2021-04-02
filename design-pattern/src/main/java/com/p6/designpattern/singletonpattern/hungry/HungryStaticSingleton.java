package com.p6.designpattern.singletonpattern.hungry;

/**
 * 另一种写法
 *
 * @author huangyong
 * @date 2021/3/28 21:34
 **/
public class HungryStaticSingleton {

    private static HungryStaticSingleton singleton;

    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance() {
        return singleton;
    }
}
