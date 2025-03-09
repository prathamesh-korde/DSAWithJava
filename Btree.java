
import java.util.LinkedList;
import java.util.Queue;


public class Btree{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildBinary(int[] nodes){
            idx++;
           if(nodes[idx]==-1){
            return null;
           }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildBinary(nodes);
            newNode.right=buildBinary(nodes);
         
            return newNode;
        }
    } 
    public static void preorder(Node root){ //O(n)
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.left);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.left);
        System.out.println(root.data+" ");
    }

    public static void levelOrder(Node root){
        if(root==null)
            return;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node current = q.remove();
            if(current==null){
                System.out.println();
                if(q.isEmpty())
                    break;
                 else
                    q.add(null);
            }else{
                System.out.print(current.data+" ");
                if(current.left != null)
                    q.add(current.left);

                if(current.right!=null)
                    q.add(current.right);
                
            }
        }

    }
    
    public static int countOfNode(Node root){
        if(root==null){
            return 0;
        }
        int leftCount = countOfNode(root.left);
        int rightCount = countOfNode(root.right);

        return leftCount+rightCount+1;
    }
    public static int SumOfNode(Node root){
        if(root==null){
            return 0;
        }

        int leftSum = SumOfNode(root.left);
        int rightSum = SumOfNode(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int hightofTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight = hightofTree(root.left);
        int rightHeight = hightofTree(root.right);

        int myHeight = Math.max(leftHeight, rightHeight)+1;

        return myHeight;
    }

    public static int DiameterOfTree(Node root){
        if(root==null){
            return 0;
        }
        int dia1 = DiameterOfTree(root.left);
        int dia2 = DiameterOfTree(root.right);
        int dia3 = hightofTree(root.left)+hightofTree(root.right)+1;
        return Math.max(dia3, Math.max(dia2, dia1));
        
    }

    static class treeInfo{
        int hight;
        int diameter;

        treeInfo(int hight , int diameter){
            this.hight=hight;
            this.diameter=diameter;
        }
    }
    public static treeInfo diameter2(Node root){
        if(root==null){
            return new treeInfo(0, 0);
        }
        treeInfo left = diameter2(root.left);
        treeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.hight, right.hight)+1;

        int dia1 = left.diameter;
        int dia2 = right.diameter;
        int dia3 = left.hight+right.hight+1;

        int mydiamath=Math.max(dia1,(Math.max(dia3, dia2)));

        treeInfo myInfo = new treeInfo(myHeight,mydiamath);
        return myInfo;
    
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildBinary(nodes);
        levelOrder(root);
        System.out.println(root.data);

        System.out.println(diameter2(root).diameter);
    }
}