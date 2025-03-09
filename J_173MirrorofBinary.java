
class Node {
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class Solution {
    public void mirror(Node node) {
        if (node == null) {
            return;
        }
        
        mirror(node.left);
        mirror(node.right);
     
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Solution tree = new Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Inorder traversal before mirroring:");
        tree.inOrder(root);
        
        tree.mirror(root);
        
        System.out.println("\nInorder traversal after mirroring:");
        tree.inOrder(root);
    }
}