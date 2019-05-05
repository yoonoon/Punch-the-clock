package big;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class homeworkFrame extends JFrame implements ActionListener {
    private int width;
    private int height;
    private TimerTask imgTask;
    private Timer timer;
    private String[] imgs = {"F:/1.png", "F:/2.png", "F:/3.png", "F:/4.png","F:/5.png", "F:/6.png"};
    private Panel topPanel, leftPanel, cardPanel2, cardPanel, cardPanel3, cardPanel4;
    private JMenu m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11;
    private JMenu n1, n2, n3;
    private JButton  preButton, nextButton, firstButton, lastButton;
    private CardLayout card;

    public homeworkFrame () {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;
        init();
        setBackground(Color.GRAY);
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init () {

        setLayout(null);
        topPanel = new Panel();
        topPanel.setBackground(new Color(43,43,43));
        topPanel.setBounds(0, 0, 1920, 1080);
        topPanel.setLayout(null);
        add(topPanel);

        JLabel imgLabel = new JLabel();
        URL url = homeworkFrame.class.getResource("F:/1.png");
        Icon icon = new ImageIcon(url);
        imgLabel.setIcon(icon);
        imgLabel.setBounds(0, 0, 1980, 50);
        Font font = new Font("微软雅黑", Font.CENTER_BASELINE, 22);

        JLabel bgLabel = new JLabel();
        topPanel.add(bgLabel);
        bgLabel.setBounds(300, -100, 1420, 700);
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bgLabel);
        imgTask = new TimerTask() {
            @Override
            public void run() {
                int i = 0;
                int len = imgs.length - 1;
                while (true) {
                    try {
                        File file = new File(imgs[i]);
                        InputStream inputStream = new FileInputStream(file);
                        byte[] bytes = new byte[(int) file.length()];
                        inputStream.read(bytes);
                        Icon icon = new ImageIcon(bytes);
                        bgLabel.setIcon(icon);
                        try {
                            Thread.sleep(6000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        i++;
                        if (i == len) {
                            i = 0;
                        }
                    } catch (IOException e) {
                        System.out.println("IO异常");
                    }
                }
            }
        };
        timer = new Timer();
        timer.schedule(imgTask, 0, 3000);

        JButton j1=new JButton("类别");
        j1.setBackground(new Color(43,43,43));
        JButton j2=new JButton("绝地求生");
        j2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("cmd.exe /c start " + "https://www.douyu.com/g_jdqs");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        j2.setBackground(new Color(43,43,43));

        JButton j3=new JButton("英雄联盟");
        j3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("cmd.exe /c start " + "https://www.douyu.com/g_LOL");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        j3.setBackground(new Color(43,43,43));

        JButton j4=new JButton("主机游戏");
        j4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("cmd.exe /c start " + "https://www.douyu.com/g_TVgame");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        j4.setBackground(new Color(43,43,43));

        JButton j5=new JButton("炉石传说");
        j5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("cmd.exe /c start " + "https://www.douyu.com/g_How");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        j5.setBackground(new Color(43,43,43));

        JButton j6=new JButton("刺激战场");
        j6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Runtime.getRuntime().exec("cmd.exe /c start " + "https://www.douyu.com/g_jdqscjzc");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        j6.setBackground(new Color(43,43,43));


        j1.setFocusPainted(false);
        j1.setBorderPainted(false);
        j2.setFocusPainted(false);
        j2.setBorderPainted(false);
        j3.setFocusPainted(false);
        j3.setBorderPainted(false);
        j4.setFocusPainted(false);
        j4.setBorderPainted(false);
        j5.setFocusPainted(false);
        j5.setBorderPainted(false);
        j6.setFocusPainted(false);
        j6.setBorderPainted(false);


        j1.setBounds(50,50,150,45);
        j2.setBounds(100,50,150,45);
        j3.setBounds(150,50,150,45);
        j4.setBounds(200,50,150,45);
        j5.setBounds(250,50,150,45);
        j6.setBounds(30050,50,150,45);

        topPanel.add(j1);
        topPanel.add(j2);
        topPanel.add(j3);
        topPanel.add(j4);
        topPanel.add(j5);
        topPanel.add(j6);


        Font font2=new Font("宋体",Font.BOLD,18);
        j1.setFont(font2);
        j1.setForeground(Color.WHITE);
        j2.setFont(font2);
        j2.setForeground(Color.WHITE);
        j3.setFont(font2);
        j3.setForeground(Color.WHITE);
        j4.setFont(font2);
        j4.setForeground(Color.WHITE);
        j5.setFont(font2);
        j5.setForeground(Color.WHITE);
        j6.setFont(font2);
        j6.setForeground(Color.WHITE);


        JLabel imgLabel2 = new JLabel();
        URL url2 = homeworkFrame.class.getResource("/img/33.png");
        Icon icon2 = new ImageIcon(url2);
        imgLabel2.setIcon(icon2);
        imgLabel2.setBounds(1600, -100, 600, 700);
        topPanel.add(imgLabel);
        topPanel.add(imgLabel2);



        JLabel imgLabel3 = new JLabel();
        URL url3 = homeworkFrame.class.getResource("/img/7.png");
        Icon icon3 = new ImageIcon(url3);
        imgLabel3.setIcon(icon3);
        imgLabel3.setBounds(300,500,220,150);

        JLabel label=new JLabel("狂仔酷炫");
        label.setBounds(300,650,200,50);
        label.setForeground(Color.WHITE);
        topPanel.add(imgLabel3);
        topPanel.add(label);


        JLabel imgLabel4 = new JLabel();
        URL url4 = homeworkFrame.class.getResource("/img/8.png");
        Icon icon4 = new ImageIcon(url4);
        imgLabel4.setIcon(icon4);
        imgLabel4.setBounds(550,500,220,150);

        JLabel label2=new JLabel("进击的神乐");
        label2.setBounds(550,650,200,50);
        label2.setForeground(Color.WHITE);

        topPanel.add(imgLabel4);
        topPanel.add(label2);

        JLabel imgLabel5 = new JLabel();
        URL url5 = homeworkFrame.class.getResource("/img/9.png");
        Icon icon5 = new ImageIcon(url5);
        imgLabel5.setIcon(icon5);
        imgLabel5.setBounds(800,500,220,150);

        JLabel label3=new JLabel("少女可乐橙");
        label3.setBounds(800,650,200,50);
        label3.setForeground(Color.WHITE);

        topPanel.add(imgLabel5);
        topPanel.add(label3);

        JLabel imgLabel6 = new JLabel();
        URL url6 = homeworkFrame.class.getResource("/img/10.png");
        Icon icon6 = new ImageIcon(url6);
        imgLabel6.setIcon(icon6);
        imgLabel6.setBounds(1050,500,220,150);

        JLabel label4=new JLabel("伊太刀刀");
        label4.setBounds(1050,650,200,50);
        label4.setForeground(Color.WHITE);
        topPanel.add(imgLabel6);
        topPanel.add(label4);

        JLabel imgLabel7 = new JLabel();
        URL url7 = homeworkFrame.class.getResource("/img/11.png");
        Icon icon7 = new ImageIcon(url7);
        imgLabel7.setIcon(icon7);
        imgLabel7.setBounds(1300,500,220,150);
        JLabel label5=new JLabel("UU娇哒哒呀");
        label5.setBounds(1300,650,200,50);
        label5.setForeground(Color.WHITE);

        topPanel.add(imgLabel7);
        topPanel.add(label5);

        JLabel imgLabel8 = new JLabel();
        URL url8 = homeworkFrame.class.getResource("/img/12.png");
        Icon icon8 = new ImageIcon(url7);
        imgLabel7.setIcon(icon7);
        imgLabel7.setBounds(1300,500,220,150);
        JLabel label6 =new JLabel("UU娇哒哒呀");
        label6.setBounds(1300,650,200,50);
        label6.setForeground(Color.WHITE);


    }

    public static void main (String[] args) {
        new homeworkFrame();
    }

    @Override
    public void actionPerformed (ActionEvent e) {

        if (e.getSource()==firstButton){
            card.first(cardPanel);
        }
        if (e.getSource()==nextButton){
            card.next(cardPanel2);
        }
        if (e.getSource()==preButton){
            card.show(cardPanel3,"pre");
        }if (e.getSource()==lastButton){
            card.show(cardPanel4,"last");
        }
    }

}

