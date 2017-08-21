package com.xmm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger= LogManager.getLogger("mylog");
    
    public static void main( String[] args )
    {
    
        
        Map m=new HashMap();
        
        for(int i=0;i<200;i++){
            m.put(""+i,i);
            
        }

        Iterator it=m.keySet().iterator();
        int i=0;
        while(it.hasNext()){
            i++;
            String key=it.next()+"";
            if(i==158||i==59){
                System.out.println(i);
                m.remove(""+i);
            }
            
        }
        System.out.println(m.size());

        
        
//        if(logger.isTraceEnabled()){
//            logger.trace("log4j trace message");
//        }
//        if(logger.isDebugEnabled()){
//            logger.debug("log4j debug message");
//        }
//        if(logger.isInfoEnabled()){
//            logger.info("log4j info message");
//        }
//        if(logger.isErrorEnabled()){
//            logger.error("log4j error message");
//        }
        
    }
}
