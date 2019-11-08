

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
     * Non-compliant code.
     */
    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }
    
}


