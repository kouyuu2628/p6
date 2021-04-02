package com.p6.designpattern.factorypattern.simplefactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 8:59
 **/
public class SimpleCourseFactory {

    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
