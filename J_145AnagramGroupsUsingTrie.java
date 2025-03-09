import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    List<String> words = new ArrayList<>();
}

class AnagramTrie {
    private final TrieNode root;

    public AnagramTrie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        char[] sortedChars = word.toCharArray();
        Arrays.sort(sortedChars);
        String sortedKey = new String(sortedChars);

        TrieNode currentNode = root;
        for (char c : sortedKey.toCharArray()) {
            currentNode = currentNode.children.computeIfAbsent(c, k -> new TrieNode());
        }
        currentNode.words.add(word);
    }

    public List<List<String>> collectAnagrams() {
        List<List<String>> result = new ArrayList<>();
        collectAnagramsHelper(root, result);
        return result;
    }

    private void collectAnagramsHelper(TrieNode node, List<List<String>> result) {
        if (!node.words.isEmpty()) {
            result.add(new ArrayList<>(node.words));
        }
        for (TrieNode child : node.children.values()) {
            collectAnagramsHelper(child, result);
        }
    }
}

public class J_145AnagramGroupsUsingTrie {
    public static void main(String[] args) {
        String[] arr = {"act", "god", "cat", "dog", "tac"};

        AnagramTrie trie = new AnagramTrie();
        for (String word : arr) {
            trie.insert(word);
        }
        List<List<String>> result = trie.collectAnagrams();

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
