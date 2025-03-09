import java.util.HashSet;

class Node {
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class nodePairSum {
    boolean findTarget(Node root, int target) {
        HashSet<Integer> set = new HashSet<>();
        return inorder(root, target, set);
    }
    
    boolean inorder(Node root, int target, HashSet<Integer> set) {
        if (root == null) return false;
        
        if (inorder(root.left, target, set)) return true;
        
        if (set.contains(target - root.data)) return true;
        
        set.add(root.data);
        
        return inorder(root.right, target, set);
    }
}

public class NodePairSum {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(7);
        
        nodePairSum solution = new nodePairSum();
        int target = 9;
        
        if (solution.findTarget(root, target)) {
            System.out.println("Pair found!");
        } else {
            System.out.println("No pair found.");
        }
    }
}
