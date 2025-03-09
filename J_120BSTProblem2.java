
import java.util.ArrayList;

//all possible way to reach leaf from root
public class J_120BSTProblem2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static Node Insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
         if(root.data>val){
            //left subtree
            root.left=Insert(root.left,val);
        }
        else{
            //right subtree
            root.right=Insert(root.right,val);
        }
        return root;
       
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

public static void printRootToLeaf(Node root,ArrayList<Integer> path){
    if(root==null){
        return;
    }
    path.add(root.data);

    //leaf node
    if(root.left==null && root.right==null){
        printPath(path);
    }else{
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
    }
    path.remove(path.size()-1);
}
    public static void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print( root.data+" ");
        InOrder(root.right);
    }

    public static boolean Search(Node root , int key){  //O(H)
        if(root==null){
            return false;
        }
        if(root.data<key){
            return Search(root.left, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return Search(root.right, key);
        }
    }

    public static void main(String[] args) {
         int values[] = {8,5,3,1,4,6,10,11,14};
         Node root = null;
         
        for(int i=0;i<values.length;i++){
          root = Insert(root, values[i]);
        }
    
        printRootToLeaf(root,  new ArrayList<>());
    }
}
