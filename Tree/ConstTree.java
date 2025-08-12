//Given two arrays representing the inorder and preorder traversals of a binary tree, construct the tree and return the root node of the constructed tree.

//Note: The output is written in postorder traversal.
class Node {

    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class ConstTree {

    static int preIndex = 0;

    public static Node buildTree(int[] inorder, int[] preorder) {
        preIndex = 0;
        return buildTreeUtil(inorder, preorder, 0, inorder.length - 1);
    }

    private static Node buildTreeUtil(int[] inorder, int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }

        Node root = new Node(preorder[preIndex++]);

        if (inStart == inEnd) {
            return root;
        }

        int inIndex = search(inorder, inStart, inEnd, root.data);

        root.left = buildTreeUtil(inorder, preorder, inStart, inIndex - 1);
        root.right = buildTreeUtil(inorder, preorder, inIndex + 1, inEnd);

        return root;
    }

    private static int search(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        int[] inorder = {4, 2, 5, 1, 6, 3, 7};
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};

        Node root = buildTree(inorder, preorder);

        System.out.println("Inorder traversal of the constructed tree:");
        printInorder(root);
    }
}
