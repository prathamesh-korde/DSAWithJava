//Given a string s consisting of lowercase characters, the task is to find the count of all substrings that start and end with the same character.

public class SubStrFirstLast {
    public static  int countSubstring(String s) {
        s = s.toLowerCase().replaceAll("[^a-z]", ""); // Keep only lowercase letters

    int[] freq = new int[26];
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
        int n = freq[i];
        count += n * (n + 1) / 2;
    }
    return count;
        
    }

    public static void main(String[] args) {
        String s="abcdxyz";
        System.out.println("count of all substrings that start and end with the same character is "+countSubstring(s));
    }
}
