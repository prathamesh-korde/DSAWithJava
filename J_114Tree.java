//implementing tree
public class J_114Tree {
    static class Node{
         int data;
         Node right;
         Node left;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class BinaryTree{
        static int i=-1;
        public static Node buildBinary(int[] nodes){
            i++;
            if(nodes[i]==-1){
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left=buildBinary(nodes);
            newNode.right=buildBinary(nodes);


            return newNode;
        }

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildBinary(nodes);
        System.out.println(root.data);
    }
}
