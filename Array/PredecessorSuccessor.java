import java.util.*;
public class PredecessorSuccessor{
    static class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}

public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static ArrayList<Node> inOrderTrv(Node root,ArrayList<Node> inorder){
        if(root == null){
            return inorder;
        }
        inOrderTrv(root.left,inorder);
        inorder.add(root);
        inOrderTrv(root.right,inorder);
        return inorder;
        
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        int predecessor  = Integer.MIN_VALUE;
        ArrayList<Node> inorder = new ArrayList<Node>();
        inOrderTrv(root,inorder);
        
        Node pre = null;
        Node suc = null;
        
         for (int i = 0; i < inorder.size(); i++) {
            if (inorder.get(i).data < key) {
                pre = inorder.get(i);
            } else if (inorder.get(i).data > key) {
                suc = inorder.get(i);
                break; 
            }
        }
        
        inorder.clear();
        inorder.add(pre);  
        inorder.add(suc); 
        
        return inorder; 
    }
    public static void main(String[] args) {
        PredecessorSuccessor ps = new PredecessorSuccessor();
        Node root = null;
        
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        for (int key : keys) {
            root = insert(root, key);
        }

        int searchKey = 65;
        ArrayList<Node> result = ps.findPreSuc(root, searchKey);

        Node pre = result.get(0);
        Node suc = result.get(1);

        System.out.println("Key: " + searchKey);
        System.out.println("Predecessor: " + (pre != null ? pre.data : "None"));
        System.out.println("Successor: " + (suc != null ? suc.data : "None"));
    }
  }

