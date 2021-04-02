package com.p6.designpattern.proxypattern.dynamicproxy;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/4/1 21:26
 **/
public class Test {

    public static void main(String[] args) {
        IPerson instance = new JdkMeipo().getInstance(new Zhangsan());
        instance.findLove();

        IPerson instance1 = new JdkMeipo().getInstance(new Lisi());
        instance1.findLove();
    }
}
