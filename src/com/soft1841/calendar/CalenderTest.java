package com.soft1841.calendar;

import java.util.Calendar;

public class CalenderTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONDAY)+1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println("当前时间“：" + year + "-"+ month + "-" + day + " " + hour + ":" + minute + ":" + second);
    }
}
