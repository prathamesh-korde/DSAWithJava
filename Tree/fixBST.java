class FixBST {
    Node first = null, middle = null, last = null, prev = null;

    void help(Node root) {
        if (root == null) return;
        
        help(root.left);
        
        if (prev != null && prev.data > root.data) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        
        help(root.right);
    }

    void swap(Node node1, Node node2) {
        int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }

    void correctBST(Node root) {
        help(root);
        
        if (last == null) {
            swap(first, middle);
        } else {
            swap(first, last);
        }
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    public static void main(String[] args) {
        FixBST solution = new FixBST();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8);
        solution.correctBST(root);
        inorder(root);
    }
}

class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
