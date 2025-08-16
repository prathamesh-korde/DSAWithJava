import java.util.*;
public class LargestNumber {
     public static String findLargest(int[] arr) {
       StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int val : arr) {
            list.add(String.valueOf(val));
        }

        
        list.sort((a,b)-> (b+a).compareTo(a+b));

        
        if (list.get(0).equals("0")) {
            return "0";
        }
         
        for (String s : list) {
            str.append(s);
        }

        return str.toString();
    }
   
    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        int[] arr = {10, 20, 30, 40};
        System.out.println(largestNumber.findLargest(arr)); // Output: 40302010
    }
}
