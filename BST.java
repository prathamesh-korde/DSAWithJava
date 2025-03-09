public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data<val){
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean searchEle(Node root,int key){
        //O(h)
        if(root==null){
            return false;
        }
        if(key>root.data){
            return searchEle(root.right, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return searchEle(root.left, key);
        }
    }

    //verry IMP
public static Node deletNode(Node root,int key){
    if (root == null) {
        return null; 
    }

    if(root.data>key){
        root.left=deletNode(root.left, key);
    }
   else if(root.data<key){
        root.right=deletNode(root.right, key);
    }
    else{
    //case 1
    if(root.left==null && root.right==null){
        return null;
    }

    //case 2
    if(root.left==null){
        return root.right;
    }
    if(root.right==null){
        return root.left;
    }

    //case 3
    Node IS = InorderSuccessor(root.right);
    root.data = IS.data;
    root.right = deletNode(root.right, IS.data);
    }
    return root;
}
public static Node InorderSuccessor(Node root){
    while(root.left != null){
        root=root.left;
    }
    return root;
}

public static void printInRange(Node root,int x,int y){
    if(root==null){
        return;
    }
    if(root.data>=x && root.data<=y){
        printInRange(root.left, x, y);
        System.out.print(root.data+" ");
        printInRange(root.right, x, y);
    }
    else if(root.data>=y){
        printInRange(root.left, x, y);
    }
    else{
        printInRange(root.right, x, y);
    }
}
    public static void main(String[] args) {
        int valus[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int val : valus){
            root=insert(root, val);
        }
        inOrder(root);
        System.out.println();
       deletNode(root, 4);
       inOrder(root);
       System.out.println();
       printInRange(root, 6, 10);
    }
}
