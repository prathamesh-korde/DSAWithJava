//generally asked in coding round
//v.imp(yad kar lena)
//if sting contain n character then the no of subsequence are 2^n;
//time complexity O(2^n)
public class j_75subsSquence {
    public static void subsequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);
        //if want to come
        subsequence(str, idx+1, newString+currentChar);
        //if not
        subsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="aadbca";
        subsequence(str, 0, "");
    }
}

