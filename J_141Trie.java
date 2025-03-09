public class J_141Trie{

    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            //end of word 
            eow=false;
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node crr = root;
        for(int i=0;i<word.length();i++){ //O(L) ; L-> length of word
            int idx = word.charAt(i)-'a';
            if(crr.children[idx]==null){ 
                //add new Node 
                crr.children[idx] = new Node();
            }
            if(i==word.length()-1){
                crr.children[idx].eow=true;
            }
            crr = crr.children[idx];
        }
    }

    public static boolean search(String key){
        Node crr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            Node node = crr.children[idx];

            if( node == null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }
            crr=crr.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key) {
        int length = key.length();
        if(length == 0) {
            return true;
        }
        for(int i=1; i<=length; i++) {
            if( search(key.substring(0, i)) &&
                wordBreak(key.substring(i)) ) {
                    return true;
                }
        }
        return false;
    }
 
    
    public static void main(String[] args) {
        String Words[] ={"i","like","sam","samsung","mobile"};
       String key = "ilikesam";
        for(String str : Words){
            insert(str);
            
        }
        System.out.println(wordBreak(key));

    }
}