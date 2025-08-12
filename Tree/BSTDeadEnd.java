class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTDeadEnd {

    static boolean dfs(Node root, int mini, int maxi) {
        if (root == null) return false;

        if (root.left == null && root.right == null && mini == maxi)
            return true;

        return dfs(root.left, mini, root.data - 1) ||
               dfs(root.right, root.data + 1, maxi);
    }

    public boolean isDeadEnd(Node root) {
        return dfs(root, 1, Integer.MAX_VALUE);
    }

    public static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    public static void main(String[] args) {
        BSTDeadEnd tree = new BSTDeadEnd();
        Node root = null;

        int[] values = {8, 5, 2, 3, 7, 11, 4};  
        for (int val : values) {
            root = insert(root, val);
        }

        if (tree.isDeadEnd(root))
            System.out.println("BST contains a dead end.");
        else
            System.out.println("BST does not contain any dead end.");
    }
}
