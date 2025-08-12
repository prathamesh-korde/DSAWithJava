//Sum of nodes on the longest path
/*Given a binary tree root[], you need to find the sum of the nodes on the longest path from the root to any leaf node. If two or more paths have the same length, the path with the maximum sum of node values should be considered.
 
 */



public class LongestPathSum {

    static class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
    private static int sum, level;

    public int sumOfLongRootToLeafPath(Node root) {
        sum = 0;
        level = -1;
        dfs(root, 0, 0);
        return sum;
    }

    private void dfs(Node node, int currSum, int currLevel) {
        if (node == null) return;

        currSum += node.data;

        if (node.left == null && node.right == null) {
            if (currLevel == level) {
                sum = Math.max(currSum, sum);
            } else if (currLevel > level) {
                level = currLevel;
                sum = currSum;
            }
        }

        dfs(node.left, currSum, currLevel + 1);
        dfs(node.right, currSum, currLevel + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);

        LongestPathSum tree = new LongestPathSum();
        int result = tree.sumOfLongRootToLeafPath(root);
        System.out.println("Sum of the longest path is: " + result);
    }
}
