package com.soft1841.punch.spirit;

interface Move {
    public String move();
}

interface Sing {
    public String sing();
}

public class Spirit implements Move, Sing {
    @Override
    public String sing() {
        return "唱歌";
    }

    @Override
    public String move() {
        return "跳舞";
    }

    public static void main(String[] args) {
        Spirit spirit = new Spirit();
        System.out.println("精灵一边" + spirit.sing() + "，一边" + spirit.move());
    }
}

