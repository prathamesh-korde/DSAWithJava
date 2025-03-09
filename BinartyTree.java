import java.util.*;
public class BinartyTree {
    private Node root;
    public BinartyTree(){

    }
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }

    // insert element
    public void populate(Scanner sc){
        System.out.println("enter root-");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }

    private void populate(Scanner sc , Node node){
        System.out.println("do you want to enter left of ");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter the val of left node");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);

        }
        System.out.println("do you want to enter right of ");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the val of right node");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);

    }
    } 
    public void display(){
        display(root,"");
    }
    private display (Node node ,String i)
   
