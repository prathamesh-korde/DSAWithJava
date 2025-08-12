import java.util.*;

public class CuttingBinary {
    private static final Set<String> powersOfFive = new HashSet<>();

    static {
        long num = 1;
        while (num <= (1L << 30)) {
            powersOfFive.add(Long.toBinaryString(num));
            num *= 5;
        }
    }

    public static int cuts(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (sub.charAt(0) != '0' && powersOfFive.contains(sub)) {
                    if (dp[j] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
    public static void main(String[] args) {
        String s = "101101101";
        System.out.println("minimum number of such pieces the string can be divided into is "+cuts(s));
    }
}
