package com.p6.designpattern.prototypepattern.shallow;

import java.util.List;

/**
 * xxx
 *
 * @author huangyong
 * @date 2021/3/30 22:17
 **/
public class Course implements Cloneable {

    private double price;
    private String name;
    private Integer level;
    private List<String> list;

    @Override
    protected Course clone() {
        try {
            return (Course) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Course{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", list=" + list +
                '}';
    }
}
