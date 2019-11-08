import java.io.*;

/**
 * R03_NUM03_J
 * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
 */
public class R03_NUM03_J {

    public static void main(String[] args) {

        //test code
        try {
            InputStream input = new FileInputStream("./R03_NUM03.txt"); 
            DataInputStream inst = new DataInputStream(input);  
            long retNum = getInteger(inst);
            System.out.println(retNum);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        } 
    }
    
    /**
     * Compliant code
     */
    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
}