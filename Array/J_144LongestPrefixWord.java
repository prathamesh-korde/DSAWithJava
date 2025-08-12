


public class J_144LongestPrefixWord {

    static class Node {
        Node[] child;
        boolean eow;

        Node(){
            child = new Node[26];
            for(int i=0;i<26;i++){
                child[i]=null;
            }
            eow = false;
        }   
    }
   static Node root = new Node();

   public static void insert(String word){
    Node crr = root;
    for(int i=0;i<word.length();i++){
        int idx = word.charAt(i)-'a';
        if(crr.child[idx] == null){
           crr.child[idx] = new Node();
        }
        if(i==word.length()-1){
            crr.child[idx].eow = true;
        }
        crr=crr.child[idx];
    }
   }
   public static String ans ="";

   public static void LongestPrefixWord(Node root,StringBuilder temp){
    if(root==null){
        return;            
    }
    for(int i=0;i<26;i++){
        if(root.child[i] !=null && root.child[i].eow==true){
            temp.append((char)(i+'a'));
            if(temp.length()>ans.length()){
                ans = temp.toString();
            }

            LongestPrefixWord(root.child[i], temp);

            temp.deleteCharAt(temp.length()-1);
        }

    }

   }
    public static void main(String[] args) {
       String word[] = {"a","banana","app","appl","ap","apply","apple"};
       for(int i=0;i<word.length;i++){
        insert(word[i]);
       }
       LongestPrefixWord(root,new  StringBuilder(" "));
       System.out.println(ans);
    }
}
