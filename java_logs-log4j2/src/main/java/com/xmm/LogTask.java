package com.xmm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 生成log的线程类
 */
public class LogTask implements Runnable{

    private String logTag;
    private String name;

    public LogTask(String logTag,String name) {
        this.logTag = logTag;
        this.name=name;
    }

    public void run() {
//        switch (logTag){
//            case "DEBUG" :
//                System.out.println("");
//            case "INFO" :
//                System.out.println("");
//            case "WARN" :
//                System.out.println("");
//            case "ERROR" :
//                System.out.println("");
//            default:break;
//        }
        Logger logger=null;
        try {
            Thread.sleep(500);
            logger= LogManager.getLogger(name);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        for(int i=0;i<5;i++){
            logger.error("this is a error log");
        }
        for(int i=0;i<10;i++){
            logger.warn("this is a warn log");
        }
        for(int i=0;i<15;i++){
            logger.info("this is a info log");
        }
        for(int i=0;i<20;i++){
            logger.debug("this is a debug log");
        }
        
    }

}
