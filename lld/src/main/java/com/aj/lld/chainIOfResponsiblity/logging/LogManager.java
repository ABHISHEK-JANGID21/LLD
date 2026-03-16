package com.aj.lld.chainIOfResponsiblity.logging;

class LogManager {

    public static Logger getLoggerChain() {
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNext(debugLogger);
        debugLogger.setNext(errorLogger);

        return infoLogger;
    }
}

