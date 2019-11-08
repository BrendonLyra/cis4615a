

/**
 * R06_MET01_j  
 * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
 */
public class R06_MET01_J {
    
    public static void main(String[] args) {
        
        // instantiate variables
        int x, y, ret;

        // testing if it works regularly
        x = 0; y = 4;
        ret = getAbsAdd(x, y);

        // should print 4
        System.out.println(ret);

        x = Integer.MIN_VALUE;
        y = Integer.MAX_VALUE;

        // should throw exception if compliant
        ret = getAbsAdd(x, y);
        System.out.println(ret);

    }

    /**
   * Compliant Code
   * 
   */
    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException();
        }
        return absX + absY;
    }   
}


