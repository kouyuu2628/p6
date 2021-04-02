package com.p6.designpattern.prototypepattern.demo;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/30 22:06
 **/
public class DemoBean {

    private int a;
    private Long b;
    private String c;

    public DemoBean() {
    }

    public DemoBean(int a, Long b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }
}
