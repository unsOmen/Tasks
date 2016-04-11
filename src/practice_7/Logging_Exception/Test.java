package practice_7.Logging_Exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by OmeN on 11.04.2016.
 */
class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("Logging Exception");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Test {

    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Перехвачено: " + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Перехвачено: " + e);
        }
    }
}
