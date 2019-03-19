package com.soft1841.graphical;

/**
 * 图形类
 * @author 王龙傲
 * 2019.3.10
 */
public abstract class Shape {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();
}
