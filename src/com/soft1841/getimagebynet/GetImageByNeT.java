package com.soft1841.getimagebynet;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


class GetImageByNet extends Object implements Runnable{
    public static void main(String[] args)  {
        GetImageByNet getImageByNet = new GetImageByNet();
        getImageByNet.run();
    }
    @Override
    public void run(){
        try {
            URL url = new URL("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1554764359&di=bc1d5590b3e27e3d9f7f0b36d9247239&src=http://www.51yuansu.com/pic/cover/00/12/24/57810cca08b78_610.jpg");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5*1000);
            InputStream inStream = conn.getInputStream();
            ByteArrayOutputStream out1 = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inStream.read(buffer)) != -1){
                out1.write(buffer,0,len);
            }
            inStream.close();
            byte[] data = out1.toByteArray();
            File imageFile = new File("F://1.jpg");
            OutputStream out2 = new FileOutputStream(imageFile);

            out2.write(data);
            out2.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}