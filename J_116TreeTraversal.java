class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class J_116TreeTraversal {
    Node root;

    // In-Order Traversal (Left -> Root -> Right)
    void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Pre-Order Traversal (Root -> Left -> Right)
    void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Post-Order Traversal (Left -> Right -> Root)
    void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        J_116TreeTraversal tree = new J_116TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-Order Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPre-Order Traversal:");
        tree.preOrder(tree.root);

        System.out.println("\nPost-Order Traversal:");
        tree.postOrder(tree.root);
    }
}