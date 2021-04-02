package com.p6.designpattern.singletonpattern.register;

/**
 * 优点：官方推荐，最优雅的单例写法，不能被反射破坏，类似于饿汉式单例，线程安全
 * 缺点：在某些情况下会造成内存浪费
 *
 * @author huangyong
 * @date 2021/3/29 21:54
 **/
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
