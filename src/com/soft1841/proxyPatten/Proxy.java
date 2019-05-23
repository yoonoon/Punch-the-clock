package com.soft1841.proxyPatten;

public class Proxy implements Subject {
    @Override
    public void buyMac() {

        RealSubject realSubject = new RealSubject();
        realSubject.buyMac();
        this.WraoMac();
    }

    private void WraoMac() {
        System.out.println("用盒子装好Mac.");
    }
}
