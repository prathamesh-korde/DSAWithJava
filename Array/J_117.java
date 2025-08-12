
public class J_117 {
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
    static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height,int diameter){
            this.height=height;
            this.diameter=diameter;
        }  

        public static TreeInfo diameter2(Node root){
            if(root==null){
               return new TreeInfo(0,0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);

            int myHeight = Math.max(left.height,right.height)+1;

            int dai1 = left.diameter;
            int dia2 = right.diameter;
            int dia3 = left.height+right.height+1;

            int myDiameter = Math.max(dia2,Math.max(dai1, dia3));
            TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
            return myInfo;
        }
    }
    static class CheckSubTree{
        public static boolean isIdentical(Node root,Node subRoot){
            if(root==null && subRoot==null){
                return true;
            }
            if(root==null || subRoot==null){
                return false;
            }
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        public static boolean isSubTree(Node root,Node subRoot){
            if(subRoot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if(root.data==subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            if(root.data == subRoot.data){
          return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
            }
            return false;
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    
        // SubTree
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
    
        // Get the diameter
        TreeInfo result = TreeInfo.diameter2(root);
        System.out.println("Diameter of the tree is: " + result.diameter);
    
        // Check if subRoot is a subtree of root
        boolean isSubtree = CheckSubTree.isSubTree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + isSubtree);
    }
    
}
