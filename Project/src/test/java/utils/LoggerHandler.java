package utils;


import org.apache.log4j.Logger;

public class LoggerHandler {
    private static Logger logger= Logger.getLogger(LoggerHandler.class);

    public static void createLogInfo(String log){
        logger.info(log);
    }

    public static void createLogError(String log){
        logger.error(log);
    }
    
}