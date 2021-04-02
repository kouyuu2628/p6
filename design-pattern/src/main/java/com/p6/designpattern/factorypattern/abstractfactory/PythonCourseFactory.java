package com.p6.designpattern.factorypattern.abstractfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 10:10
 **/
public class PythonCourseFactory extends AbstractCourseFactory {
    @Override
    protected INote createNote() {
        init();
        return new PythonNote();
    }

    @Override
    protected IVideo createVideo() {
        init();
        return new PythonVideo();
    }
}
