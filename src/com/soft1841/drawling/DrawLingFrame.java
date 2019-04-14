package com.soft1841.drawling;

import javax.swing.*;
import java.awt.*;

/**
 * 绘制彩色线条

 */
public class DrawLingFrame extends JFrame {
    public DrawLingFrame(){
        init();
        setTitle("绘制彩色线条");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  void init(){
        getContentPane().setBackground(new Color(240,240,240));
        DrawLineThread drawLineThread=new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }
    public static void main (String[] args) {
        new DrawLingFrame();
    }
}

