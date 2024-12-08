
public class j_55string_builder {
    public static void main(String[] args) {
        //Declaration
        StringBuilder sb = new StringBuilder("prathamesh sudhakar");
        System.out.println(sb);
        //Get A Character from Index
        //get char
        System.out.println(sb.charAt(0));
       // Set a Character at Index
       //set char
       sb.setCharAt(0, 'a');
       System.out.println(sb);
       //Insert a Character at Some Index
       sb.insert(0, 's');
       System.out.println(sb);
       sb.setCharAt(1, 'p');     
       System.out.println(sb);        
       //Delete char at some Index
       sb.delete(0, 1);
       System.out.println(sb);
      //Append a char 
      //Append means to add something at the end.
      sb.append(" korde");
      System.out.println(sb);
      //Print Length of String
      System.out.println(sb.length());
    }
    
}

