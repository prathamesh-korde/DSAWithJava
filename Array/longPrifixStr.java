public class longPrifixStr {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    TrieNode root = new TrieNode();

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null)
                node.children[index] = new TrieNode();
            node = node.children[index];
        }
        node.isEnd = true;
    }

    // Check if all prefixes of a word exist in the Trie
    public boolean allPrefixesExist(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            node = node.children[index];
            if (node == null || !node.isEnd)
                return false;
        }
        return true;
    }

    // Main function to find the required word
    public String longestString(String[] words) {
        for (String word : words)
            insert(word);  // insert all words into the Trie

        String result = "";

        for (String word : words) {
            if (allPrefixesExist(word)) {
                if (word.length() > result.length() || 
                   (word.length() == result.length() && word.compareTo(result) < 0)) {
                    result = word;
                }
            }
        }

        return result;
    }
     public static void main(String[] args) {
        longPrifixStr sol = new longPrifixStr();
        String[] words = {"a", "ap", "app", "appl", "apple", "apply", "appla"};
        System.out.println("longest string in words[] such that every prefix of it is also present in the array words[] is-"+sol.longestString(words));
     }
}
