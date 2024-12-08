//remove duplicaters in existing string and print newstring
//time complexity=O(n)

public class j_74removeDuplicate {
    public static boolean[] map=new boolean[26];//bydefalt it store false inside the indexes
    //we declare map as static then we are able to use it directly in method without passing in parameter

    public static void remove_Duplicate(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        } 
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']==true){
            remove_Duplicate(str, idx+1, newString);
        }else{
            newString +=currentChar;
            map[currentChar-'a']=true;
            remove_Duplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abbccddzza";
        remove_Duplicate(str, 0, "");
    }
}
