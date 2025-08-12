
import java.util.HashSet;

//print all the unique subsequence of string
//to get an unique value we use set in java-l.e-hash set,link set,tree set
public class j_76uniqueSubSequence {
    public static void subSequences(String str,int idx,String subSequence,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(subSequence)){
                return;
            }else{
                System.out.println(subSequence);
                set.add(subSequence);
                return;
            }
        }
        char currChar=str.charAt(idx);
        //to be
        subSequences(str, idx+1, subSequence+currChar, set);
        //not to be
        subSequences(str, idx+1, subSequence, set);
    }
    public static void main(String[] args) {
        String str="abc";
        HashSet<String> set =new HashSet<>();
        subSequences(str, 0, "",set);
    }
}
