class TreeNode {
    int value;
    TreeNode left, right;

    // Constructor to create a new tree node
    public TreeNode(int value) {
        this.value = value;
        left = right = null; // Initialize children as null
    }
}
public class J_115BinaryTree{
    TreeNode root;

    // Constructor to create an empty tree
    public J_115BinaryTree () {
        root = null;
    }

    

    public static void main(String[] args) {

        J_115BinaryTree  tree = new J_115BinaryTree();
        tree.root = new TreeNode(1); // Root node
        tree.root.left = new TreeNode(2); // Left child of root
        tree.root.right = new TreeNode(3); // Right child of root
        tree.root.left.left = new TreeNode(4); // Left child of node 2
        tree.root.left.right = new TreeNode(5); // Right child of node 2

        // Printing the root value as an example
        System.out.println("Root of the tree: " + tree.root.value); 
    }
}
