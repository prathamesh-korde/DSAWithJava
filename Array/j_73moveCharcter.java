//move all 'x' to the end of the string
//time complexity-O(n+count(max))=>O(n+n)=>O(2n)
public class j_73moveCharcter {
    public static void move(String org_str,String new_str,int count,int idx){
        if(idx==org_str.length()){
            for (int i = 1; i <= count; i++) {
                new_str+='x';   
            }
            System.out.println(new_str);
            return;
        }
        if(org_str.charAt(idx)!='x'){
            new_str+=org_str.charAt(idx);
            move(org_str, new_str, count, idx+1);
        }
        else{
            move(org_str, new_str, count+1, idx+1);
        }
    }
    public static void main(String[] args) {
       String org_str="axbcxxd";
       String new_str="";
       move(org_str, new_str, 0,0);
    }
}
