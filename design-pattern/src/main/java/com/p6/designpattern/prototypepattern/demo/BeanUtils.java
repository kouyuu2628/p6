package com.p6.designpattern.prototypepattern.demo;

import java.lang.reflect.Field;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/30 22:05
 **/
public class BeanUtils {

    public static Object copy(Object prototype) {
        Class<?> clazz = prototype.getClass();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field declaredField : clazz.getDeclaredFields()) {
                declaredField.setAccessible(true);
                declaredField.set(returnValue, declaredField.get(prototype));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
