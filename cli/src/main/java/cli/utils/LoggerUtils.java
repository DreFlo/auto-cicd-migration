package cli.utils;

import cli.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtils {

    final private static Logger logger = Logger.getLogger(Main.class.getName());

    public static Logger getLogger() {
        return logger;
    }

    public static void log(Level level, String message) {
        getLogger().log(level, message);
    }
}
