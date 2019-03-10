package com.soft1841.punch.parallelogram;

/**
 * @author 王龙傲
 * 2019.3.10
 */
interface  DrawImage{
    public void draw();
}
class Rectangle implements DrawImage{

    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
class Square implements DrawImage{

    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
class Diamond implements DrawImage{

    @Override
    public void draw() {
        System.out.println("画菱形");
    }
}
public class SpecialParallelogram {
    public static void main(String[] args) {
        DrawImage[] images = {new Rectangle(),new Square(),new Diamond()};
        for (int i =0; i<images.length;i++){
            images[i].draw();
        }
    }
}
