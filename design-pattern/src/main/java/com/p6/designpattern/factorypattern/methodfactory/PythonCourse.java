package com.p6.designpattern.factorypattern.methodfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 9:02
 **/
public class PythonCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制python课程");
    }
}
