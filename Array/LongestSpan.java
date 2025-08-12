//Longest Span in two Binary Arrays
//Given two binary arrays, a1[] and a2[]. Find the length of longest common span (i, j) where j>= i such that a1[i] + a1[i+1] + .... + a1[j] =  a2[i] + a2[i+1] + ... + a2[j].
import java.util.*;

public class LongestSpan {
    public static int longestCommonSum(int[] a1, int[] a2) {
         int n=a1.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(sum,-1);
        int ans=0;
        for(int i=0;i<n;i++){
            sum+=a1[i]-a2[i];
            if(map.containsKey(sum)) ans=Math.max(ans,i-map.get(sum));
            else map.put(sum,i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a1 = {0, 1, 0, 0, 0, 0};
        int[] a2 = {1, 0, 1, 0, 0, 1};
        System.out.println(" length of longest common span (i, j) is "+longestCommonSum(a1, a2));
    }
}
