package com.xmm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger= LogManager.getLogger("mylog");
    
    public static void main( String[] args )
    {

        if(logger.isTraceEnabled()){
            logger.trace("log4j trace message");
        }
        if(logger.isDebugEnabled()){
            logger.debug("log4j debug message");
        }
        if(logger.isInfoEnabled()){
            logger.info("log4j info message");
        }
        if(logger.isErrorEnabled()){
            logger.error("log4j error message");
        }
        
    }
}
