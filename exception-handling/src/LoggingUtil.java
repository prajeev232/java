/*
Used to log messages for different parts of application. Logging system categorizes messages with log levels to indicate their severity or importance.
Highest to lowest: SEVERE, WARNING, INFO, CONFIG, FINE, FINER and FINEST. Also, there is ALL (log everything) and OFF (log nothing).
*/

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingUtil {
    private static final Logger logger = Logger.getLogger(LoggingUtil.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);

        logger.info("App started");
        logger.fine("This is a FINE debug call.");
        logger.warning("Low on memory...");
        logger.severe("This is a SEVERE warning call.");
    }
}
