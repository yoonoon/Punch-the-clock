package com.soft1841.bookTest;


import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("1", "白夜行","       22"));
        list.add(new Book("3", "嫌疑人X的献身","33"));
        list.add(new Book("5", "假面前夜","     44"));
        System.out.println("输出格式");
        System.out.println(list);

        System.out.println("add 方法");
        list.add(new Book("2","HTML","11"));
        System.out.println(list);
        System.out.println("remove 方法");
        list.remove(new Book("4","JAVA","55"));
        System.out.println(list);
        System.out.println("set 方法");
        list.set(3, new Book("6","高数","66"));
        System.out.println(list);
        System.out.println(list.indexOf(new Book("1","白夜行","22")));
        System.out.println(list.lastIndexOf(new Book("5","假面前夜","44")));
        }
    }

