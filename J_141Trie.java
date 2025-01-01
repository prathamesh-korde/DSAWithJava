public class J_141Trie{

    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node crr = root;
        for(int i=0;i<word.length();i++){
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
    
    public static void main(String[] args) {
        String words[] = {"the","a","there","their","any"};
        for(String str : words){
            insert(str);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));

    }
}