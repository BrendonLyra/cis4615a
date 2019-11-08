import java.math.BigInteger;

/**
 * R04_STR03_J
 * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
 */
public class R04_STR03_J {

    public static void main(String[] args) {

        String testStr = "530500452766";
        BigInteger testBigInt = new BigInteger(testStr);
        BigInteger retBigInt = charEncoding(testStr);

        // Throw exception if wrong
        // if (testBigInt.compareTo(retBigInt) != 0) {
        //     throw new IllegalStateException();
        // }
        
        // true is correct. False is wrong (non-compliant).
        System.out.println(retBigInt.equals(testBigInt));
    }

    /**
     * Compliant code
     */
    public static BigInteger charEncoding(String str) {

        BigInteger x = new BigInteger(str);
        String s = x.toString(); // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        
        // return value, make sure its correct
        return x;
    }
}
