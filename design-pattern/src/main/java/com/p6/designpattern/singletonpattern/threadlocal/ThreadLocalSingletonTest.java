package com.p6.designpattern.singletonpattern.threadlocal;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/29 23:23
 **/
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        // 主线程的实例
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + ThreadLocalSingleton.getInstance());
        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());
        // 线程1的实例
        thread1.start();
        // 线程2的实例
        thread2.start();
    }

}

class ExecutorThread implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton instance1 = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton instance2 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + instance1);
        System.out.println(Thread.currentThread().getName() + ":" + instance2);
    }
}
