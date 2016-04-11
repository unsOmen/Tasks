package practice_7.Logging_Exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by OmeN on 11.04.2016.
 */

class LoggingException2 {
    private static Logger logger = Logger.getLogger("LoggingException_2");
    static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logException(e);
        }

        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            logException(e);
        }
    }
}
public class Test2 {

}
