package com.p6.designpattern.proxypattern.staticproxy;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/4/1 21:14
 **/
public class Test {

    public static void main(String[] args) {
        ZhangsanBaba proxy = new ZhangsanBaba(new Zhangsan());
        proxy.findLove();
    }
}
