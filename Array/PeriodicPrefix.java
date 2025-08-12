

public class PeriodicPrefix {

    public static int getLongestPrefix(String s) {
        int n = s.length();

        // Start from the largest proper prefix and go down
        for (int len = n - 1; len >= 1; len--) {
            boolean value = true;

            for (int i = len; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % len)) {
                    value = false;
                    break;
                }
            }

            if (value) return len; // Found longest proper prefix length
        }

        return -1; // No such prefix
    }

    public static void main(String[] args) {
        System.out.println(getLongestPrefix("aaaaaa")); // 5
        System.out.println(getLongestPrefix("abcab"));  // 3
        System.out.println(getLongestPrefix("ababd"));  // -1
    }
}
