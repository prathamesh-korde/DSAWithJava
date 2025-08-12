//Closest Neighbour in BST
/*
 Given the root of a binary search tree and a number k, find the greatest number in the binary search tree that is less than or equal to k.
 */

public class ClosestNeighbour {
    static class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
    int ans = -1;
    void inOrder(Node root,int k) {
        if(root == null) return;
        
        inOrder(root.left,k);
        if(root.data <= k) {
            ans = Math.max(ans,root.data);
            inOrder(root.right,k);
        }
    }
    public int findMaxFork(Node root, int k) {
        inOrder(root,k);
        return ans;
    }
    public Node insert(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public static void main(String[] args) {
        ClosestNeighbour cn = new ClosestNeighbour();
        Node root = null;

        // Insert elements into the BST
        int[] values = {20, 8, 22, 4, 12, 10, 14};
        for (int val : values) {
            root = cn.insert(root, val);
        }

        int k = 13;
        int result = cn.findMaxFork(root, k);
        System.out.println("Greatest value ≤ " + k + " is: " + result);
    }
}
