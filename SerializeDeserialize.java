import java.util.ArrayList;

public class SerializeDeserialize {

    static class Node {
       int data;
       Node left;
       Node right;


       public Node(int data){
        this.data=data;
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

     public static  ArrayList<Integer> serialize(Node root) {
        // code here
         ArrayList<Integer> ans=new  ArrayList<Integer>();
         preOrder(root,ans);
         deSerialize(ans);
         return ans;
    }

    public static Node deSerialize(ArrayList<Integer> arr) {
        int[] res =new int[1];
        return  buildTree(arr,res);
    }
    
    public static void preOrder(Node root,ArrayList<Integer> ans)
    {
        if(root==null)
        {
            ans.add(null);
            return;
        }
        
        ans.add(root.data);
        preOrder(root.left,ans);
        preOrder(root.right,ans);
    }
    public static Node buildTree(ArrayList<Integer> arr,int[] index)
    {
        if(index[0]>=arr.size()||arr.get(index[0])==null)
        {
            index[0]++;
            return null;
        }
        Node root=new Node(arr.get(index[0]));
        index[0]++;
        root.left=buildTree(arr,index);
        root.right=buildTree(arr,index);
        return root;
        
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("before Serialize & Deserialize " +root.data);
        serialize(root);
        System.out.println("after Serialize & Deserialize "+root.data);
    }
}
