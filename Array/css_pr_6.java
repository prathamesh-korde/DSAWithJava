import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;
public class css_pr_6 {
    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.ZERO))
            return a;
        else
            return gcd(b, a.mod(b));
    }
    public static BigInteger modInverse(BigInteger e, BigInteger phi) {
        return e.modInverse(phi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a large prime number p:");
        BigInteger p = sc.nextBigInteger();
        System.out.println("Enter another large prime number q:");
        BigInteger q = sc.nextBigInteger();
        BigInteger n = p.multiply(q);
        System.out.println("value of n-"+n);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger e;
        do {
            e = new BigInteger(phi.bitLength(), new Random());
        } while (e.compareTo(BigInteger.ONE) <= 0 || e.compareTo(phi) >= 0 || !gcd(e, phi).equals(BigInteger.ONE));
        BigInteger d = modInverse(e, phi);
        System.out.println("value of e-"+e);
        System.out.println("value of d-"+d);
        System.out.println("Public Key (e, n): (" + e + ", " + n + ")");
        System.out.println("Private Key (d, n): (" + d + ", " + n + ")");
        System.out.println("Enter a message (as a number) to encrypt:");
        BigInteger message = sc.nextBigInteger();
        BigInteger encrypted = message.modPow(e, n);
        System.out.println("Encrypted message: " + encrypted);
        BigInteger decrypted = encrypted.modPow(d, n);
        System.out.println("Decrypted message: " + decrypted);
        sc.close();
    }
}
