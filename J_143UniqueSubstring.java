public class J_143UniqueSubstring {

    static class Node {
        Node[] child;
        boolean eow;

        Node(){
            child = new Node[26];
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            eow=false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node crr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(crr.child[idx]==null){
                crr.child[idx] = new Node();
            }
            if(i==word.length()-1){
                crr.child[idx].eow=true;
            }
            crr = crr.child[idx];
        }
    }

    public static int countSum(Node root){
        int count =0;
        if(root == null){
            return 0;
        }
        for(int i=0;i<26;i++){
            if(root.child[i] != null){
                count+=countSum(root.child[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        String str ="apple"; 
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countSum(root));
    }
}
