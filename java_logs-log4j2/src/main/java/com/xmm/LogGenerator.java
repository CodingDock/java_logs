package com.xmm;

import java.util.HashMap;
import java.util.Map;

/**
 * 日志生成器
 */
public class LogGenerator {
    public static final String DEBUG="DEBUG";
    public static final String INFO="INFO";
    public static final String WARN="WARN";
    public static final String ERROR="ERROR";

    public static void main(String[] args) throws InterruptedException {
        generateCommonLogs();
    }

    /**
     * 生成一些各种级别的普通日志
     */
    public static void generateCommonLogs() throws InterruptedException {
        for(int i=0;i<20;i++) {
            Thread.sleep(500);
            new Thread(new LogTask("", "com.xmm.user.service_"+i),"log_thread"+i).start();
        }
    }
    

}
