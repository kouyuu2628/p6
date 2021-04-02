package com.p6.designpattern.factorypattern.abstractfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 10:00
 **/
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("记录java笔记");
    }
}
