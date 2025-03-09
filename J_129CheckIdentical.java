class TreeNode {
    int data;
    TreeNode left, right;

    // Constructor to initialize a tree node
    TreeNode(int value) {
        this.data = value;
        left = right = null;
    }
}

public class J_129CheckIdentical {
    TreeNode root;

    // Method to check if two trees are identical
    boolean areIdentical(TreeNode node1, TreeNode node2) {
        // Both nodes are null, trees are identical up to this point
        if (node1 == null && node2 == null) return true;

        // If one of them is null, trees are not identical
        if (node1 == null || node2 == null) return false;

        // Compare data and recurse for left and right subtrees
        return (node1.data == node2.data) &&
               areIdentical(node1.left, node2.left) &&
               areIdentical(node1.right, node2.right);
    }

    public static void main(String[] args) {
        J_129CheckIdentical tree1 = new J_129CheckIdentical();
        J_129CheckIdentical tree2 = new J_129CheckIdentical();

        // Constructing Tree 1
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);

        // Constructing Tree 2
        tree2.root = new TreeNode(1);
        tree2.root.left = new TreeNode(2);
        tree2.root.right = new TreeNode(3);

        // Checking if the two trees are identical
        System.out.println("Are the trees identical? " +
            tree1.areIdentical(tree1.root, tree2.root));
    }
}
