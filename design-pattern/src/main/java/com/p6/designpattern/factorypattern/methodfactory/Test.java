package com.p6.designpattern.factorypattern.methodfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 9:32
 **/
public class Test {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.createCourse();
        course.record();
    }
}
