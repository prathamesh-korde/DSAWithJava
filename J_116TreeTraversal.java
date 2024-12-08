

    import java.util.*;

    public class J_116TreeTraversal {
         static class Node {
            int data;
            Node left;
            Node right;
    
            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;         
            }
        }
        static class BinaryTree{
            static int idx=-1;
            public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx]==-1){
                    return  null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);
    
                return newNode;
                }
            }
      public static void preOrder(Node root){
        //time-complexity-O(n)
        if(root==null){
          return;
         }
         System.out.print(root.data+" ");
         preOrder(root.left);
         preOrder(root.right);
    }
    
    public static void inOrder(Node root){ //O(n)
        if(root==null){
            return;
           }
           inOrder(root.left);
           System.out.print(root.data+" ");
           inOrder(root.right);
    }
    public static void postOrder(Node root){ //O(n)
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node current = q.remove();
            if(current == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(current.data+" ");
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
    
            }
        }
    }
    public static int countofNodes(Node root){  
        //O(n)
        if(root==null){
            return 0;
        }
        int leftNodes=countofNodes(root.left);
        int rightNodes=countofNodes(root.right);
        return leftNodes+rightNodes+1;
    }
    
    public static int countofNodesSum(Node root){  //O(n)
        //O(n)
        if(root==null){
            return 0;
        }
        int leftNodesSum=countofNodesSum(root.left);
        int rightNodesSum=countofNodesSum(root.right);
        return leftNodesSum+rightNodesSum+root.data;
    }

    public static int height(Node root){ //O(n)
        if(root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int totatlHeight= Math.max(leftHeight, leftHeight)+1;
        return totatlHeight;
    }

    public static int diameter(Node root){//O(n2)
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;

        return Math.max(diam3,Math.max(diam2, diam1));
    }
        public static void main(String[] args) {
            //nodes in pre-order sequence
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println(root.data);
            System.out.println("pre-order traversal");
            preOrder(root);
            System.out.println(" \n in-order traversal");
            inOrder(root);
            System.out.println(" \n post-order traversal");
            postOrder(root);
            System.out.println(" \n level-order traversal");
            levelOrder(root);
            System.out.print("count of nodes-");
            System.out.println(countofNodes(root));
            System.out.println("sum of nodes-");
            System.out.println(countofNodesSum(root));
            System.out.println("height of tree "+height(root));
            System.out.println("max diameter of tree-"+diameter(root));
        }
    }
        