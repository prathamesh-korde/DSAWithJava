public class LowestCommonAncestor{

    static class Node{
        Node left;
        Node right;
        int data;
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


    Node LCA(Node root, Node n1, Node n2) {
        return sol(root , Math.min(n1.data , n2.data) , Math.max(n1.data,n2.data));
     }
     
     Node sol(Node root , int min , int max){
         if(root==null){
             return root;
         }
         if((min<root.data  && root.data<max) || root.data == min || root.data==max){
             return root;
         }
         if(max<root.data){
             return sol(root.left,min,max);
         }
         return sol(root.right,min, max);
     }


     public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
          root = Insert(root, values[i]);
        }
        LowestCommonAncestor lcaFinder = new LowestCommonAncestor();
        Node n1 = new Node(3);
        Node n2 = new Node(6);
        Node lca = lcaFinder.LCA(root, n1, n2);
        
        if (lca != null) {
            System.out.println("Lowest Common Ancestor: " + lca.data);
        } else {
            System.out.println("No common ancestor found.");
        }
     }
}