package com.soft1841.drawling;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * 绘制线条
 * Created by 田震 on 2019/4/9 23:10
 */
public class DrawLineThread implements Runnable {
    int x=200;
    int y=100;
    private JFrame frame;
    private Color[]colors={Color.WHITE,Color.BLUE,Color.GREEN,Color.ORANGE,Color.YELLOW,Color.red,Color.PINK,Color.LIGHT_GRAY};
    public void setFrame(JFrame frame){
        this.frame=frame;
    }
    @Override
    public void run () {
        Random random=new Random();
        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Graphics graphics=frame.getGraphics();
            graphics.setColor(colors[random.nextInt(colors.length)]);
            graphics.drawLine(x,y,650,y);
            y+=10;
            if (y>=500){
                y=100;
            }
        }
    }
}
