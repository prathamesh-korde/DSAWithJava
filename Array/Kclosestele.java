/*You are given a sorted array arr[] of unique integers, an integer k, and a target value x. Return exactly k elements from the array closest to x, excluding x if it exists.

An element a is closer to x than b if:


|a - x| < |b - x|, or
|a - x| == |b - x| and a > b (i.e., prefer the larger element if tied)


Return the k closest elements in order of closeness. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kclosestele {
    public static int[] printKClosest(int[] arr, int k, int x) {
        // code here
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
       for(int val : arr){
           if(x-val != 0){
           map.put(val,Math.abs(val - x));
           }
       }
      
        
       List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        
        entryList.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue();
            } else {
                return b.getKey() - a.getKey(); 
            }
        });

        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 10, 12};
        int k = 2;
        int x = 4;
        System.out.println(" the k closest elements in order of closeness."+printKClosest(arr, k, x));
    }
}
