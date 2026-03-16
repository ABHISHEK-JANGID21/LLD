package com.aj.llm.chainIOfResponsiblity.logging;

abstract class Logger {

    protected LogLevel level;
    protected Logger nextLogger;

    public Logger(LogLevel level) {
        this.level = level;
    }

    public void setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(LogLevel level, String message) {
        if (this.level == level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }

    protected abstract void write(String message);
}

