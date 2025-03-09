import java.util.*;
public class LongSubStr {
    public static void substr(String str, String newStr, int idx, HashSet<String> set) {
        set.add(newStr); // Store the substring
        if (idx == str.length()) {
            return;
        }
        char currentChar = str.charAt(idx);
        substr(str, newStr + currentChar, idx + 1, set); // Include current character
        substr(str, newStr, idx + 1, set); // Exclude current character
    }

    static int lcs(String s1, String s2) {
        int maxLen = 0;
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        
        substr(s1, "", 0, set1);
        substr(s2, "", 0, set2);
        
        for (String sub : set1) {
            if (set2.contains(sub)) { // O(1) lookup time
                maxLen = Math.max(maxLen, sub.length()); // Update maxLen
            }
        }
        return maxLen;
    }

    public static void main(String args[]) {
        String S1 = "ABCDGH";
        String S2 = "AEDFHR";
        System.out.println("Longest Common Subsequence Length: " + lcs(S1, S2));
    }
}
