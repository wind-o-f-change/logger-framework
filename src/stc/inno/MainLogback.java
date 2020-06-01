package stc.inno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MainLogback {
    private static final Logger logger = LoggerFactory.getLogger(MainLogback.class);

    public static void main(String[] args) {
//        Logger logger = createLoggerFor("main", "logs/logback/log.log");
        logger.info("HELLO");
        logger.debug("DEBUG");
        logger.trace("DEBUG");
    }



//    private static Logger createLoggerFor(String string, String file) {
//        LoggerContext        lc  = (LoggerContext) LoggerFactory.getILoggerFactory();
//        PatternLayoutEncoder ple = new PatternLayoutEncoder();
//
//        ple.setPattern("%date %level [%thread] %logger{10} [%file:%line] %msg%n");
//        ple.setContext(lc);
//        ple.start();
//        FileAppender<ILoggingEvent> fileAppender = new FileAppender<ILoggingEvent>();
//        fileAppender.setFile(file);
//        fileAppender.setEncoder(ple);
//        fileAppender.setContext(lc);
//        fileAppender.start();
//
//        Logger logger = (Logger) LoggerFactory.getLogger(string);
//        logger.addAppender(fileAppender);
//        logger.setLevel(Level.DEBUG);
//        logger.setAdditive(false); /* set to true if root should log too */
//
//        return logger;
//    }

}
