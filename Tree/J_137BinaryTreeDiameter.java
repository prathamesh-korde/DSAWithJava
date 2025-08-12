class TreeNode {
        int val;
        TreeNode left, right;
        
        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public class J_137BinaryTreeDiameter {
        static class Result {
            int diameter;
        }
    
        private static int height(TreeNode root, Result result) {
            if (root == null) {
                return 0;
            }   
            int leftHeight = height(root.left, result);
            int rightHeight = height(root.right, result);
            result.diameter = Math.max(result.diameter, leftHeight + rightHeight);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    
        public static int findDiameter(TreeNode root) {
            Result result = new Result();
            height(root, result);
            return result.diameter;
        }
    
        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            System.out.println("The diameter of the binary tree is: " + findDiameter(root));
        }
    }