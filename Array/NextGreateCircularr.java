import java.util.ArrayList;
import java.util.Stack;

public class NextGreateCircularr {
    //  public static ArrayList<Integer> nextLargerElement(int[] arr) {
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     int n = arr.length;
    //     for(int i=0;i<n;i++){
    //     boolean found = false;
    //     for(int j = 1; j<n ;j++){
            
    //         int idx = (i+j)%n;
    //         if(arr[i]<arr[idx]){
    //             list.add(arr[idx]);
    //             found = true;
                
    //             break;
    //         }
    //     }
    //     if (!found) list.add(-1);
    //     }
    //     return list;
    // }

    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int[] sol = new int[n];
        
        ArrayList<Integer> list = new ArrayList<>(arr.length);
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) stack.pop();
            sol[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        
        for (int i = 0; i < n; i++) {
            list.add(sol[i]);
        }
        
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 1, 1};
        System.out.println("determine the next greater element (NGE) "+nextLargerElement(arr));
    }
}
