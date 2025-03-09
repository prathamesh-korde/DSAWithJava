//printing a node lies between range of X to Y
public class J_119BSTProblem1 {
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

    public static void printlnRange(Node root ,int x, int y){
       if(root==null){
        return;
       }
        if(root.data>=x && root.data<=y){
            printlnRange(root.left, x, y);
            System.out.println(root.data+" ");
            printlnRange(root.right, x, y);
        }
        else if(root.data>=y){
            printlnRange(root.left, x, y);
        }
        else{
            printlnRange(root.right, x, y);
        }
    }
    public static void main(String[] args) {
         int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
          root = Insert(root, values[i]);
        }
        printlnRange(root, 3, 12);
    }
}
