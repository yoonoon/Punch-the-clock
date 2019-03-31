package com.soft1841.foldertest;


import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        String path = "F:\\JavaStudy";
        File file = new File(path);
        File[] fs = file.listFiles();
        for (File f:fs){
            if(!f.isDirectory()){
                String srcFileName = f.getName();
                int position = srcFileName.indexOf(".");
                String suffixName = srcFileName.substring(position);
                if (suffixName.equals(".jpg"));{
                    System.out.println(f);
                }
            }
        }
    }
}
