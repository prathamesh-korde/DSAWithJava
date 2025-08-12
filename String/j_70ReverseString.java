//print string in reverse
//time complixity-O(n)

public class j_70ReverseString {
       public static void printRev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        idx--;
        printRev(str, idx);
       }
       public static void main(String[] args) {
        String str="pratham";
        int idx=str.length()-1;
        printRev(str, idx);
       }
}
