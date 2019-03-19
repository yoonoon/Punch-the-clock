package com.soft1841.graphical;

/**
 * @author 王龙傲
 * 2019.3.10
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.name = "圆形";
        System.out.println(circle.name + "面积：" + circle.getArea());
        Rectangle rectangle = new Rectangle(2, 2);
        rectangle.name = "矩形";
        System.out.println(rectangle.name + "面积：" + rectangle.getArea());
    }
}

