package com.p6.designpattern.prototypepattern.demo;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/30 22:20
 **/
public class Test {

    public static void main(String[] args) {
        DemoBean demoBean = new DemoBean(1, 222L, "OK");
        Object copy = BeanUtils.copy(demoBean);
        System.out.println(copy);
    }
}
