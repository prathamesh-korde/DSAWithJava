
//Print leaf nodes from preorder traversal of BST
//Given a preorder traversal of a BST, find the leaf nodes of the tree without building the tree


import java.util.*;

public class LeafToPreorder {
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

      public static ArrayList<Integer> preOrder(Node root,ArrayList<Integer> preOrder){
        //time-complexity-O(n)
        if(root==null){
          return preOrder;
         }
         preOrder.add(root.data);
         preOrder(root.left,preOrder);
         preOrder(root.right,preOrder);
         return preOrder;
    }
    public static ArrayList<Integer> leafNodes(ArrayList<Integer> preOrder) {
        
       ArrayList<Integer> list = new ArrayList<Integer>();
       Stack<Integer> stk = new Stack<>();
       int n = preOrder.size();
       
       for(int i= 0;i<n ;i++){
           
           int count=0;
           int crr = preOrder.get(i);
           
           
           while(!stk.isEmpty() && crr > stk.peek()){
               stk.pop();
               count++;
           }
           
           if(count>=2){
               list.add(preOrder.get(i-1));
           }
           
           stk.push(crr);
           
       }
       list.add(preOrder.getLast());
       return list;
    }
    public static void main(String[] args) {
         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
            System.out.println("pre-order traversal");
            ArrayList<Integer> preOrder = new ArrayList<Integer>();
            preOrder(root,preOrder);
            System.out.println(preOrder);
            System.out.println("leaf nodes of the tree without building the tree from pre-order sequence are - ");
            System.out.println(leafNodes(preOrder));
    }
}
