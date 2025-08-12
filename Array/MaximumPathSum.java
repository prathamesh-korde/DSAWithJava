
class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class MaximumPathSum {

    private int helper(Node node, int[] maxSum) {
        if (node == null) {
            return 0;
        }
        int leftSum = Math.max(0, helper(node.left, maxSum));
        int rightSum = Math.max(0, helper(node.right, maxSum));
        maxSum[0] = Math.max(maxSum[0], leftSum + rightSum + node.data);
        return node.data + Math.max(leftSum, rightSum);
    }

    public int findMaxSum(Node root) {
        int[] maxSum = {Integer.MIN_VALUE};
        helper(root, maxSum);
        return maxSum[0];
    }

    public static void main(String[] args) {
        // Creating tree
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);
        MaximumPathSum solution = new MaximumPathSum();
        System.out.println("Maximum Path Sum: " + solution.findMaxSum(root));
    }
}
