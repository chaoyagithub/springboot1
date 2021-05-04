package com.study;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
Jul(实现)+JCL(门面)
 */
public class JulMain {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(JulMain.class);
        System.out.println(log.getClass());
        log.info("这里是JulMain");

        //Logger logger = Logger.getLogger(JulMain.class.getName());
        //logger.info("这里是JulMain");
    }
}
