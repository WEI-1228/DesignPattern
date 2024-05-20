package cn.anlper.respchain;

public class Main {
    static AbstractLogger getLoggerChain() {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger loggerChain = getLoggerChain();

        loggerChain.logMessage(AbstractLogger.INFO, "info消息");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG,"debug消息");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR, "错误消息");
    }
}
