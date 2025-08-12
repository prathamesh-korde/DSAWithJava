
//time complexity(n*n!)
public class j_83allPossibleArragement {
    public static void permu(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            String subStr=str.substring(0,i)+str.substring(i+1);
            permu(subStr, permutation+current);
        }
        
    }
    public static void main(String[] args) {
        String str="123";
        permu(str, "");
    }
}
