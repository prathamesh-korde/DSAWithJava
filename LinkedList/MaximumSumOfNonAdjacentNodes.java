//Maximum sum of Non-adjacent nodes

/*Given a binary tree with a value associated with each node. Your task is to select a subset of nodes such that the sum of their values is maximized, with the condition that no two selected nodes are directly connected that is, if a node is included in the subset, neither its parent nor its children can be includeed */

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MaximumSumOfNonAdjacentNodes {
    public int getMaxSum(Node root) {
        int[] result = dfs(root);
        return Math.max(result[0], result[1]);
    }

    private int[] dfs(Node node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int include = node.data + left[1] + right[1];
        int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{include, exclude};
    }

    public static Node createSampleTree() {
        Node root = new Node(10);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(5);
        return root;
    }

    public static void main(String[] args) {
        MaximumSumOfNonAdjacentNodes tree = new MaximumSumOfNonAdjacentNodes();
        Node root = createSampleTree();
        System.out.println(tree.getMaxSum(root));
    }
}
