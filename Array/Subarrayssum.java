import java.util.ArrayList;
import java.util.HashMap;

public class Subarrayssum {
    //Brust Force- Time complexity - O(n^3) Space Complexity-O(1)
    // public static int cntSubarrays(int[] arr, int k) {
    //     int n = arr.length;
    //     int count = 0;
    //     for(int i=0;i<n;i++){
    //         for(int j=i;j<n;j++){
    //             int sum =0;
    //             for(int l=i;l<=j;l++){
    //                 sum+=arr[l];
    //             }
    //              if(sum == k){
    //                     count++;
    //                 }
    //         }
    //     }
    //     return count;
    // }


//Brust Force- Time complexity - O(n^2) Space Complexity-O(1)
//    public static int cntSubarrays(int[] arr, int k) {
//         // code here
//         int count = 0;
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 if(sum==k){
//                 count++;
//                 }
//             }
//         }
//         return count;
//     }

//Optimal approach- Time complexity - O(n) Space Complexity-O(n)
        public static int cntSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        int count=0;
        ArrayList<Integer> prefix = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        prefix.add(arr[0]);
        
        for(int i=1;i<n;i++){
            prefix.add(prefix.get(i - 1) + arr[i]);
        }
        map.put(0, 1);
        for(int j=0;j<n;j++){
           int val = prefix.get(j) - k;

            if (map.containsKey(val)) {
                count += map.get(val);
            }

            map.put(prefix.get(j), map.getOrDefault(prefix.get(j), 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 20, 3, 10, 5};
        int k=33;
        System.out.println("number of subarrays whose sum exactly equal to a given number k is - "+cntSubarrays(arr, k));
    }
}
