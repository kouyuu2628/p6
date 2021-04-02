package com.p6.designpattern.factorypattern.simplefactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 9:06
 **/
public class Test {

    public static void main(String[] args) {
        ICourse course = new SimpleCourseFactory().create(JavaCourse.class);
        course.record();
    }
}
