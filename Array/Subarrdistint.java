import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Subarrdistint {
    public static int totalElements(int[] arr) {
        // code here
        int n = arr.length;
        int start = 0;
        int maxLength = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            while(map.size()>2){
                map.put(arr[start],map.get(arr[start])-1);
                if(map.get(arr[start])==0){
                    map.remove(arr[start]);
                }
                start++;
            }
            maxLength=Math.max(maxLength,i-start+1);
        }
         return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 2, 2};
        System.out.println(" length of the longest subarray that contains at most two distinct integers is - "+totalElements(arr));
    }
}
