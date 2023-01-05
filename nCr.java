
public class nCr {


    //
    //   Computes gcd using Euclidean Algorithm
    //
    public static long gcd(long a, long b) {
        if (a > b) return gcd(b,a);
        if (a == 0) return b;
        return gcd(b%a, a);
    } // gcd


    //
    //   Computes n!/(r! (n-r)!)
    //
    public static long nCr(int n, int r) {
        long ret = 1;
        long g;
        int i = 0;
        if ((n-r) < r) r = n-r;
        while (r-i > 0) {
            i++;
            g = gcd((long)i, (long)n);
            ret = ret / ((long)i/g) * ((long)n/g);
            n--;
        }
        return ret;
    } // nCr


    public static void testchoose(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", nCr(i, j));
            }
            System.out.print('\n');
        }
    } // testchoose


}

