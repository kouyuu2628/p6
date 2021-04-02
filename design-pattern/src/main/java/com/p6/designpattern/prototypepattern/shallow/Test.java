package com.p6.designpattern.prototypepattern.shallow;

import java.util.Arrays;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/30 22:26
 **/
public class Test {

    public static void main(String[] args) {
        Course course = new Course();
        course.setPrice(2.2D);
        course.setName("123");
        course.setLevel(3);
        course.setList(Arrays.asList("a", "b", "c"));

        Course clone = course.clone();

        System.out.println("prototype:" + course);
        System.out.println("clone:" + clone);
        System.out.println(course == clone);
        System.out.println(course.getList() == clone.getList());
    }
}
