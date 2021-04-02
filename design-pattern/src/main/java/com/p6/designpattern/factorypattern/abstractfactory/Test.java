package com.p6.designpattern.factorypattern.abstractfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 10:25
 **/
public class Test {

    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNote().edit();
        javaCourseFactory.createVideo().record();
    }
}
