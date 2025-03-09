


public class J_118BST {
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

    //verry importent
    public static Node deletNode(Node root , int val){
        if(root.data>val){
            root.left=deletNode(root.left, val);
        }
        else if(root.data<val){
            root.right=deletNode(root.right, val);
        }
        else{//root.data ==value
            //case-1
            if(root.left==null && root.right==null){
                return null;
            }
            // case-2
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }

            //case-3
            int IS = InorderSuccessor(root.right);
            root.data=IS;
            root.right=deletNode(root.right,IS);

        }
        return root;
       
        }
        public static int InorderSuccessor(Node root){
            while(root.left != null){
                root=root.left;
            }
            return root.data;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
          root = Insert(root, values[i]);
        }

        InOrder(root);
        System.out.println();
        if(Search(root, 7)){
            System.out.println("found");
        }else{
            System.out.println("not-found");
        }
        System.out.println("after deleating a node");
       deletNode(root, 4);
       InOrder(root);
    }
}
