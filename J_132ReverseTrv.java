// perform a reverse level order traversal of a binary tree:
import java.util.*;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class  J_132ReverseTrv {
    public static List<Integer> reverseLevelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result; 
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            stack.push(current);
            if (current.right != null) {
                queue.add(current.right);
            }
            if (current.left != null) {
                queue.add(current.left);
            }
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop().val);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> traversalResult = reverseLevelOrder(root);
        System.out.println("Reverse Level Order Traversal: " + traversalResult);
    }
}

