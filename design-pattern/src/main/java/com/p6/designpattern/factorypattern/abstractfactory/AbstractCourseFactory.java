package com.p6.designpattern.factorypattern.abstractfactory;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 10:04
 **/
public abstract class AbstractCourseFactory {

    public void init() {
        System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}
