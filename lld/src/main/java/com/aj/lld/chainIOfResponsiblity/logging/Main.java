
package com.aj.lld.chainIOfResponsiblity.logging;

public class Main {
    public static void main(String[] args) {

        Logger logger = LogManager.getLoggerChain();

        logger.log(LogLevel.INFO, "Application started");
        logger.log(LogLevel.DEBUG, "Fetching user details");
        logger.log(LogLevel.ERROR, "Database connection failed");
    }
}

