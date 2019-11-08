import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * R00_IDS03_J
 * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
 */
public class R00_IDS03_J {

    static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    static boolean loginSuccessful = false;

    public static void main(String[] args) {
        
        String testCase = "guest \nMay 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger" + 
        " log \nSEVERE: User login succeeded for: administrator";

        loggerTest(testCase);

    }
    
    /**
     * Compliant code
     */
    public static void loggerTest(String username) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
          } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
          }
    }

    /**
     * Sanitizing method
     */
    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }

}