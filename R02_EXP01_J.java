

/**
 * R02_EXP01_J
 * https://wiki.sei.cmu.edu/confluence/display/java/EXP01-J.+Do+not+use+a+null+in+a+case+where+an+object+is+required
 */
public class R02_EXP01_J {

    public static void main(String[] args) {

        String param = null;

        // Non-compliant code throws error
        boolean ret = isProperName(param);

        System.out.println(ret);
    }

    /**
     * helper function to see if first letter of word is upper case
     */
    private static boolean isCapitalized(String s) {
        return Character.isUpperCase(s.charAt(0));
    }

    /**
     * Non-compliant code
     */
    private static boolean isProperName(String s) {
        String names[] = s.split(" ");
        if (names.length != 2) {
            return false;
        }
        return (isCapitalized(names[0]) && isCapitalized(names[1]));
    }    
}