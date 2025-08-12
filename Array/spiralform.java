//Level Order in spiral form
/*Given a binary tree and the task is to find the spiral order traversal of the tree and return the list containing the elements.
Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right. */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class spiralform {
    
    static class Node {
    int data;
    Node left, right;  // This must be present

    Node(int val) {
        data = val;
        left = right = null;
    }
}

    public static ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        boolean dir = false;
        
        while(!que.isEmpty()){
            int n = que.size();
            int row[] = new int[n];
            
            for(int i=0 ; i<n ;i++){
                Node node = que.poll();
                
                int idx = (dir) ? i : (n-1-i);
                row[idx]= node.data;
                
                if(node.left != null){
                    que.add(node.left);
                }
                
                if(node.right != null){
                    que.add(node.right);
                }
            }
            
            for(int val : row){
                res.add(val);
            }
            
            dir = !dir;
        }
        return res;
        
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> result = findSpiral(root);
        System.out.println("Spiral Level Order Traversal:");
        System.out.println(result);
    }
}
