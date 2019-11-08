import java.io.File;
import java.io.FileNotFoundException;

/**
 * R02_XP00_J
 * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
 */
public class R02_XP00_J {

    public static void main(String[] args) {

        // test method
        deleteFile();
    }

    /**
     * Compliant code
     */
    public static void deleteFile() {

        File someFile = new File("someFileName.txt");

        // Do something with someFile
        if (!someFile.delete()) {

            // Handle failure to delete the file
            throw new FileNotFoundException();
        }
    }
}