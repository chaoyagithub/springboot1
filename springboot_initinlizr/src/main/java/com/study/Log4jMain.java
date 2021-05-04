package com.study;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Log4j(实现)+slf4j(门面)
 */
public class Log4jMain {
    public static void main(String[] args) {
        //Logger logger = Logger.getLogger(Log4jMain.class);
        Logger logger = LoggerFactory.getLogger(Log4jMain.class);
        logger.info("这里是Log4jMain");

    }
}
