//Reverse a String (using StringBuilder class)

public class j_56string_builder_q1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HellowWorld");
        for(int i=0 ; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-i-1;
            char fontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back,fontChar);
        }
        System.out.println(sb);
    }
}
