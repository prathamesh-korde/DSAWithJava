//find the first and last occurence of an element in string
//time complixity O(n) where n is length of string
public class j_71FirstNabLastOccurence{
    public static int first=-1;
        public static int last=-1;
    public static void printIdx(String str,int idx,char ch){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar==ch){
            if(first==-1){
            first=idx;
        }
        else{
            last=idx;
        }
    }
        printIdx(str, idx+1, ch);
    }
    public static void main(String[] args) {
        String str="prathamesh";
        printIdx(str,0,'a');
    }

}