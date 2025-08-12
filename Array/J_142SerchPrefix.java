public class J_142SerchPrefix{

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

        static Node root = new Node();
        public static void insert(String word){
            Node crr = root;
            for(int i=0;i<word.length();i++){
                int idx = word.charAt(i)-'a';
                if(crr.child[idx]==null){
                    crr.child[idx] = new Node();
                }
                if(word.length()-1==i){
                   crr.child[idx].eow = true;
                }
                crr = crr.child[idx];
            }
        }

        public static boolean  searchPrefix( String key){
            Node crr = root;
            for(int i=0;i<key.length();i++){
                int idx = key.charAt(i)-'a';
                if(crr.child[idx]==null){
                    return false;
                }
                crr = crr.child[idx];
            }
            return true;
        }
        public static void main(String[] args) {
            String Words[] ={"apple","app","mango","man","woman"};
            String key = "man";
            for(String str : Words){
                insert(str);
            }
            System.out.println(searchPrefix(key));
        }
    }
}
    