package com.xmm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger= LogManager.getLogger(App.class);
    
    public static void main( String[] args )
    {

        if(logger.isTraceEnabled()){
            logger.debug("log4j trace message");
        }
        if(logger.isDebugEnabled()){
            logger.debug("log4j debug message");
        }
        if(logger.isInfoEnabled()){
            logger.debug("log4j info message");
        }
        
    }
}
