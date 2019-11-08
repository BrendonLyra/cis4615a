import java.util.List;
import java.util.ArrayList;

/**
 * R07_OBJ03_J
 * https://wiki.sei.cmu.edu/confluence/display/java/OBJ03-J.+Prevent+heap+pollution
 */
public class R07_OBJ03_J {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        addToList(list, "42"); // compliant

        // Non-compliant Throws ClassCastException
        System.out.println(list.get(0));
    }

    /**
     * Compliant code
     */
    private static void addToList(List<String> list, String str) {
        list.add(str); // No warning generated
    }
}