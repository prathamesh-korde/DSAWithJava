class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class Symmetrictree {

    public boolean isSymmetric(Node root) {
        return root == null || sol(root.left, root.right);
    }

    public boolean sol(Node l, Node r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }

        // Check current nodes and their mirrored children
        return (l.data == r.data) &&
               sol(l.left, r.right) &&
               sol(l.right, r.left);
    }

    public static void main(String[] args) {
        Symmetrictree tree = new Symmetrictree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println("Is tree symmetric? " + tree.isSymmetric(root)); // Output: true
    }
}
