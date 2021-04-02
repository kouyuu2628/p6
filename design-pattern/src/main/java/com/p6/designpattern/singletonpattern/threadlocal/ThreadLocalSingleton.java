package com.p6.designpattern.singletonpattern.threadlocal;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/29 23:19
 **/
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {}

    private static ThreadLocal<ThreadLocalSingleton> threadLocalInstance = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
