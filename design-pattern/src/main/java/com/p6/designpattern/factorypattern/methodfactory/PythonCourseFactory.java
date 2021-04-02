package com.p6.designpattern.factorypattern.methodfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 9:29
 **/
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }
}
