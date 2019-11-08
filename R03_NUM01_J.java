
/**
 * R03_NUM01_J
 * https://wiki.sei.cmu.edu/confluence/display/java/NUM01-J.+Do+not+perform+bitwise+and+arithmetic+operations+on+the+same+data
 */
public class R03_NUM01_J {

    public static void main(String[] args) {
        
        // Non-compliant gives -13. Compliant gives -12.
        doCalculation();
    }

    /**
     * Non-compliant code.  
     * Gives wrong anser to what is expected
     */
    public static void doCalculation() {

        int x = -50;
        x >>= 2;

        System.out.println(x);
    }
}