package stc.inno;

import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        LogManager.getLogManager().readConfiguration();
        System.out.println(System.getProperty("java.util.logging.config.file"));

        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");

        logger.log(Level.WARNING, "WARNING", new Throwable());
        logger.logp(Level.WARNING, "stc.inno20.Main", "main", new Throwable(), () -> "WARNING");
        logger.logrb(Level.WARNING, "stc.inno20.Main", "main", ResourceBundle.getBundle("logmessage"), "WARNING");
        throw new IllegalArgumentException("123");
    }


    static class InnoFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getLevel().equals(Level.INFO);
        }
    }

    static class InnoFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return record.getLevel() + "(" + record.getLoggerName() + "): " + record.getMessage() + "\n";
        }
    }
}
