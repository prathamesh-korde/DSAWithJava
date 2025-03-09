class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class J_138LowestCommonAncestor{
    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (p.val < root.val && q.val < root.val) {
            return findLCA(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            return findLCA(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        // Sample BST
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        J_138LowestCommonAncestor lcaFinder = new J_138LowestCommonAncestor();
        TreeNode p = root.left;
        TreeNode q = root.left.right; 
        TreeNode lca = lcaFinder.findLCA(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + (lca != null ? lca.val : "null"));
    }
}