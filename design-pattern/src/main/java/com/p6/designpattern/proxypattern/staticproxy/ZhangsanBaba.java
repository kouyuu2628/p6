package com.p6.designpattern.proxypattern.staticproxy;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/4/1 21:12
 **/
public class ZhangsanBaba implements IPerson {

    private Zhangsan zhangsan;

    public ZhangsanBaba(Zhangsan zhangsan) {
        this.zhangsan = zhangsan;
    }

    @Override
    public void findLove() {
        System.out.println("开始帮儿子物色...");
        zhangsan.findLove();
        System.out.println("开始交往...");
    }
}
