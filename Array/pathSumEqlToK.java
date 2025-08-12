import java.util.ArrayList;

public class pathSumEqlToK {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    int count = 0;
    
    public int sumK(Node root, int k) {
        ArrayList<Integer> path = new ArrayList<>();
        helper(root, k, path);
        return count;
    }
    
    void helper(Node root, int k, ArrayList<Integer> path) {
        if (root == null) {
            return; 
        }

        path.add(root.data);
        int sum = 0;

        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k) count++;
        }

        helper(root.left, k, path);
        helper(root.right, k, path);

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        pathSumEqlToK solution = new pathSumEqlToK();

        // Creating tree
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);
        int k = 7; 
        System.out.println("Number of paths with sum " + k + ": " + solution.sumK(root, k));
    }
}
