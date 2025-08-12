import java.util.HashMap;

public class SubstringsDistinct {

    // Main method to run the program
    public static void main(String[] args) {
        SubstringsDistinct sd = new SubstringsDistinct();
        String s = "abcba";
        int k = 2;
        int result = sd.countSubstr(s, k);
        System.out.println("Number of substrings with exactly " + k + " distinct characters: " + result);
    }

    // Function to count substrings with exactly k distinct characters
    int countSubstr(String s, int k) {
        return countAtMost(s, k) - countAtMost(s, k - 1);
    }

    // Helper function to count substrings with at most k distinct characters
    int countAtMost(String s, int k) {
        int l = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }

            count += (r - l + 1);
        }

        return count;
    }
}
