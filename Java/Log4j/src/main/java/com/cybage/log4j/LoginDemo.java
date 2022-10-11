package com.cybage.log4j;

import org.apache.log4j.*;

public class LoginDemo {
	static Logger logger=Logger.getLogger(LoginDemo.class);

	public static void main(String[] args) {
 logger.setLevel(Level.ALL);
    	 
    	 logger.debug("debug msg");
    	 logger.info("info");
    	 logger.warn("warn msg");
    	 logger.error("error msg");
    	 logger.fatal("fatal error");
    	
        //PropertiesConfigurator is used to configure logger from properties file
      //  PropertyConfigurator.configure("log4j.properties");
 
        //Log in console in and log file
       // logger.debug("Log4j appender configuration is successful !!");
        
       /* logger.debug("Sample debug message");
        log.info("Sample info message");
        log.error("Sample error message");
        log.fatal("Sample fatal message"); */
        
        /*
         *  logger.setLevel(Level.INFO);
 
      logger.trace("Trace Message!");
      logger.debug("Debug Message!");
      logger.info("Info Message!");
      logger.warn("Warn Message!");
      logger.error("Error Message!");
      logger.fatal("Fatal Message!");
         */
	}

}
