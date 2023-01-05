
import java.util.*;

public class kth {


    //
    //   Output the k'th lexically smallest string composed of m 0s and n 1s
    //
    public static void kth(int m, int n, long k) {

        //
        //   You will replace the following routine 
        //   with your solution ..........
        //
        //
        // Stores the recurring states




    long i, ones, accum;
        i = 0;
        while (k > 0) {
            accum = i;
            ones = 0;
            while (accum > 0) {
                ones += accum %2;
                accum /= 2;
            }
            if (ones == n) k--;
            i++;
        }
        i--;
        k = (long)1 << (m+n-1);
        while (k > 0) {
            if ((k&i) > 0) System.out.print('1');
            else System.out.print('0');
            k /= 2;
        }
    } // kth


}

