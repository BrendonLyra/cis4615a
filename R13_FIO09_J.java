import java.lang.System;
import java.io.*;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;

/**
 * R13_FIO09_J
 * https://wiki.sei.cmu.edu/confluence/display/java/FIO09-J.+Do+not+rely+on+the+write%28%29+method+to+output+integers+outside+the+range+0+to+255
 */
public class R13_FIO09_J {

    public static void main(String[] args) {
        int test = 303; // > 255
        try {
            Write(test);
        } catch (Exception e) {
            // show error for HW.
            // Compliant code throws error here instead of printing below.
            System.out.print(e);
        }

    }

    /**
     * Compliant solution
     */
    public static void Write(int test) throws NumberFormatException, IOException {
        // Perform range checking
        int value = Integer.valueOf(test);
        if (value < 0 || value > 255) {
            throw new ArithmeticException("Value is out of range");
        }

        System.out.write(value);
        System.out.flush();
    }
}