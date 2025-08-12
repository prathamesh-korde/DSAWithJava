/*Given an array arr[] of integers, for each element, find the closest (distance wise) to its right that has a higher frequency than the current element.
If no such element exists, return -1 for that position.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NxtgreaterFreq {
     public static ArrayList<Integer> findGreater(int[] arr) {
      Map<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 0));
        
        for (int num : arr)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1;i>=0;i--)
        {
            while (!st.isEmpty() && freq.get(st.peek()) <= freq.get(arr[i]))
            {
                st.pop();
            }
            
            if(st.empty())
            {
                ans.set(i, -1);
            }
            else{
                ans.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 1, 3, 2, 1};
        System.out.println("Resultent output"+findGreater(arr));

    }
}
