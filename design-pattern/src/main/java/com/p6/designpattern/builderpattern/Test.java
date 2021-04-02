package com.p6.designpattern.builderpattern;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/30 23:15
 **/
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseBuilder();
        Course course = courseBuilder
                .addName("name")
                .addNote("note")
                .addPpt("ppt")
                .addVideo("video")
                .builder();
        System.out.println(course);
    }
}
