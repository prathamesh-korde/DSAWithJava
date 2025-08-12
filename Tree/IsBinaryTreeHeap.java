import java.util.LinkedList;
import java.util.Queue;

public class IsBinaryTreeHeap {

    public static class Node {
        int data;
        Node left, right;
        
        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    boolean isHeap(Node tree) {
        if (tree == null) return true;
        
        Queue<Node> q = new LinkedList<>();
        q.add(tree);
        boolean nullChild = false;
        
        while (!q.isEmpty()) {
            Node node = q.poll();
            
            // Check left child
            if (node.left != null) {
                if (nullChild || node.data < node.left.data)
                    return false;
                q.add(node.left);
            } else {
                nullChild = true;
            }
            
            // Check right child
            if (node.right != null) {
                if (nullChild || node.data < node.right.data)
                    return false;
                q.add(node.right);
            } else {
                nullChild = true;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(97);
        root.left = new Node(46);
        root.right = new Node(37);
        root.left.left = new Node(12);
        root.left.right = new Node(3);
        root.right.left = new Node(7);
        root.right.right = new Node(31);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(9);
        
        IsBinaryTreeHeap heapChecker = new IsBinaryTreeHeap();
        System.out.println(heapChecker.isHeap(root));  // Output: true
    }
}
