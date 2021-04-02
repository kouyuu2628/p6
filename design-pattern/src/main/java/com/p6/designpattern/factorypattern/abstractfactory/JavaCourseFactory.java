package com.p6.designpattern.factorypattern.abstractfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 10:10
 **/
public class JavaCourseFactory extends AbstractCourseFactory {
    @Override
    protected INote createNote() {
        init();
        return new JavaNote();
    }

    @Override
    protected IVideo createVideo() {
        init();
        return new JavaVideo();
    }
}
