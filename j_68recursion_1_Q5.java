//print x^n (stack height=log n)
public class j_68recursion_1_Q5 {
    public static int calPow(int x, int n) {
        if (n == 0) {
            return 1;  // x^0 is always 1
        }
        if (x == 0) {
            return 0;  // 0^n is always 0 for any positive n
        }

        int halfPow = calPow(x, n / 2);  // Calculate x^(n/2) once

        // If n is even
        if (n % 2 == 0) {
            return halfPow * halfPow;
        }
        // If n is odd
        else {
            return halfPow * halfPow * x;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calPow(x, n);
        System.out.println(ans);  // Should print 32 (2^5 = 32)
    }
}
