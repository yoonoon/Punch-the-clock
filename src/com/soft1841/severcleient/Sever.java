package com.soft1841.severcleient;

import jdk.net.Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动，端号口："+ss.getLocalPort());
        while (true){
            Socket socket = ss.accept();
            System.out.println("客户端："+ socket.getInetAddress() + "上线了");
            socket.close();
        }

    }
}
