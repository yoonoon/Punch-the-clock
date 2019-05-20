package com.soft1841.severcleient;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("39.96.182.225",8080);
        System.out.println("已和服务期建立连接，远程主机地址："+ socket.getRemoteSocketAddress());
    }
}
