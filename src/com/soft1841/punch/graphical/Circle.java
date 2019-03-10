package com.soft1841.punch.graphical;

/**
 * 圆形面积抽象类
 * @author 王龙傲
 * 2019.3.10
 */
public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
