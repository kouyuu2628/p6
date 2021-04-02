package com.p6.designpattern.singletonpattern.seriable;

import java.io.Serializable;

/**
 * 通过反序列化破坏单例
 *
 * 序列化：把内存中对象的状态转换为字节码的形式，把字节码通过IO输出流，写到磁盘上，永久保存下来，持久化
 * 反序列化：将持久化的字节码内容，通过IO输入流读到内存中，转化成一个Java对象
 *
 * @author huangyong
 * @date 2021/3/29 22:52
 **/
public class SerializableSingleton implements Serializable {

    private final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    // 添加此方法，就能防止单例别反序列化破坏
//    private Object readResolve() {
//        return INSTANCE;
//    }
}
