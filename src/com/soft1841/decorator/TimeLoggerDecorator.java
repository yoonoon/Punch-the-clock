package com.soft1841.decorator;


import java.util.Calendar;

public class TimeLoggerDecorator implements Logger {
    private Logger dcoratorLogger;

    public TimeLoggerDecorator(Logger dcoratorLogger){
        this.dcoratorLogger = dcoratorLogger;
    }
    @Override
    public void log(String message) {
        dcoratorLogger.log(message);
        logTime();
    }
    public void logTime(){
        System.out.println(Calendar.getInstance().getTime());
    }
}
