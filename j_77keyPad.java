//time complexity-O(4 ^n)
public class j_77keyPad{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char current=str.charAt(idx);
        String mapping=keypad[current-'0'];

        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }     
    }  
    public static void main(String[] args) {
        String str="23";
        printComb(str, 0, "");
    }
}