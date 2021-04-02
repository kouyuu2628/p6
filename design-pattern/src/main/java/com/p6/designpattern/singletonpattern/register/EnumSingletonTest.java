package com.p6.designpattern.singletonpattern.register;

import java.lang.reflect.Constructor;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/29 21:58
 **/
public class EnumSingletonTest {

    public static void main(String[] args) {
        // 枚举式单例的使用方式
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());

        // 使用反射破坏枚举式单例，会报错
        Class clazz = EnumSingleton.class;
        try {
            Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            Object o = declaredConstructor.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
