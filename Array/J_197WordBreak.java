
import java.util.HashSet;
import java.util.Set;
import javax.print.DocFlavor;

public class J_197WordBreak {

    public static boolean wordBreak(String s, String[] dictionary) {
        Set<String> set = new HashSet<>();
        int maxLength = 0;
        for (String word : dictionary) {
            set.add(word);
            maxLength = Math.max(word.length(), maxLength);
        }

        int n = s.length();
        boolean dp[] = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLength); j--) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        String s = "ilikegfg";
        String dictionary[] = {"i", "like", "man", "india", "gfg"};
        System.out.println("string s can be formed by concatenating one or more words from the dictionary[] is " + wordBreak(s, dictionary));
    }
}
