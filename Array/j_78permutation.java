//timp complexity-O(n)

public class j_78permutation {
    public static void printPara(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            //System.out.println(i);
            char current=str.charAt(i);
            //"abc"->"ab"
            String newStr =str.substring(0,i)+str.substring(i+1);
            printPara(newStr, permutation+current);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        printPara(str, "");
    }
}
