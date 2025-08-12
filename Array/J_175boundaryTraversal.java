import java.util.*;

class Node {
    int data;
    Node left, right;
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class J_175boundaryTraversal {
    public static void leftBoundary(Node root, ArrayList<Integer> list) {
        if (root == null || (root.left == null && root.right == null)) return;
        
        list.add(root.data);
        
        if (root.left != null) {
            leftBoundary(root.left, list);
        } else {
            leftBoundary(root.right, list);
        }
    }

    public static void bottomBoundary(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        
        bottomBoundary(root.left, list);
        
        if (root.left == null && root.right == null) {
            list.add(root.data);
        }
        
        bottomBoundary(root.right, list);
    }

    public static void rightBoundary(Node root, ArrayList<Integer> list) {
        if (root == null || (root.left == null && root.right == null)) return;

        if (root.right != null) {
            rightBoundary(root.right, list);
        } else {
            rightBoundary(root.left, list);
        }
        
        list.add(root.data);
    }

    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        if (node == null) return list;

        list.add(node.data);

        leftBoundary(node.left, list);

        bottomBoundary(node.left, list);
        bottomBoundary(node.right, list);

    
        rightBoundary(node.right, list);

        return list;
    }
}
