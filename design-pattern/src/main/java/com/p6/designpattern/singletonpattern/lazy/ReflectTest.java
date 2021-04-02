package com.p6.designpattern.singletonpattern.lazy;

import java.lang.reflect.Constructor;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/28 22:55
 **/
public class ReflectTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object o = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
