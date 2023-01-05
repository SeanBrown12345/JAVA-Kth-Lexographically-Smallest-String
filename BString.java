
import java.util.*;

public class BString {


    public static void main(String args[]) {
        int m, n;
        long k;
        long space;


        Scanner scan = new Scanner(System.in);


        // nCr.testchoose(10);


        // Input routine: m, n, k
        System.out.print("How many 0s? ");
        m = scan.nextInt();
        System.out.print("How many 1s? ");
        n = scan.nextInt();

        space = nCr.nCr(m+n,n);

        System.out.printf("Which binary string (1-%d)? ", space);
        k = scan.nextLong();
        System.out.print('\n');

        if ((k < 1) || (k > space)) { System.out.printf("Error: %d is not in the range [1,%d]\n\n", k, space); return; }
        System.out.printf("Binary string #%d is: ", k); kth.kth(m, n, k); System.out.print('\n');
        return;
    } // main


}

