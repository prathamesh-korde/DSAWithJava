public class substringsSum{
/* 
    public static void subStr(String str , String newStr , int idx,int sum){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        subStr(str, newStr+ch, idx+1,sum);
        subStr(str, newStr, idx+1,sum);

    }
    public static int sumSubstrings(String s) {
        subStr(s, "", 0,0);
        return 1; 
    }
        */

        public static int sumSubstrings(String s) {
         int val=0, ans=0;
        for(int i=0;i<s.length();i++) {
            val=val*10+(s.charAt(i)-'0')*(i+1);
            ans=val+ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "421";
        System.out.println("sum of all possible sub-strings of this string is "+sumSubstrings(s));;
    }
}