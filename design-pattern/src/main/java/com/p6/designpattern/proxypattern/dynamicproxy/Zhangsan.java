package com.p6.designpattern.proxypattern.dynamicproxy;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/4/1 21:11
 **/
public class Zhangsan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三要求：肤白貌美");
    }
}
