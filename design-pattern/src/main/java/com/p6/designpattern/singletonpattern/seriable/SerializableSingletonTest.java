package com.p6.designpattern.singletonpattern.seriable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/29 22:56
 **/
public class SerializableSingletonTest {

    public static void main(String[] args) {

        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        // 将s2序列化到文件中
        try (FileOutputStream fos = new FileOutputStream(new File("SerializableSingleton.obj"))) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 将文件反序列化到s1
        try (FileInputStream fis = new FileInputStream(new File("SerializableSingleton.obj"))) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // s1 != s2，单例被反序列化破坏
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

        new File("SerializableSingleton.obj").deleteOnExit();
    }
}
