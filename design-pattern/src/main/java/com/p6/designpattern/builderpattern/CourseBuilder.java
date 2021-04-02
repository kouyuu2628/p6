package com.p6.designpattern.builderpattern;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/30 23:10
 **/
public class CourseBuilder {

    private Course course = new Course();

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public CourseBuilder addPpt(String ppt) {
        course.setPpt(ppt);
        return this;
    }

    public CourseBuilder addVideo(String video) {
        course.setVideo(video);
        return this;
    }

    public CourseBuilder addNote(String note) {
        course.setNote(note);
        return this;
    }

    public Course builder() {
        System.out.println("开始构造");
        System.out.println("构造完成");
        return course;
    }
}
