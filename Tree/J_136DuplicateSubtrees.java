
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class J_136DuplicateSubtrees  {
    // Map to store the serialization of subtrees and their frequencies
    private Map<String, Integer> subtreeMap = new HashMap<>();
    // List to store the root nodes of duplicate subtrees
    private List<TreeNode> duplicateSubtrees = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serializeSubtree(root);
        return duplicateSubtrees;
    }

    private String serializeSubtree(TreeNode node) {
        if (node == null) {
            return "#"; // Represents null in serialization
        }

        // Post-order serialization
        String left = serializeSubtree(node.left);
        String right = serializeSubtree(node.right);
        String serialized = node.val + "," + left + "," + right;

        // Update the frequency of the serialized subtree
        subtreeMap.put(serialized, subtreeMap.getOrDefault(serialized, 0) + 1);

        // If the frequency is exactly 2, it's the first time we've identified this subtree as a duplicate
        if (subtreeMap.get(serialized) == 2) {
            duplicateSubtrees.add(node);
        }

        return serialized;
    }

    // Utility function to print a tree (optional for debugging)
    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        root.right.left.left = new TreeNode(4);

        J_136DuplicateSubtrees  solution = new J_136DuplicateSubtrees ();
        List<TreeNode> duplicates = solution.findDuplicateSubtrees(root);

        System.out.println("Duplicate Subtrees:");
        for (TreeNode duplicate : duplicates) {
            J_136DuplicateSubtrees .printTree(duplicate);
            System.out.println();
        }
    }
}
