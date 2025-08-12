
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class  J_133SubBinart {
    private static boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true; 
        }
        if (s == null || t == null) {
            return false; 
        }
        return (s.val == t.val) && isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false; 
        }
        if (isSameTree(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public static void main(String[] args) {
        TreeNode s = new TreeNode(3);
        s.left = new TreeNode(4);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);

        // Create subtree (t)
        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);
        System.out.println("Is t a subtree of s? " + isSubtree(s, t)); 
    }
}

