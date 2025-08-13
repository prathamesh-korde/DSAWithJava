import java.util.Arrays;
/*You are given an array arr[] of size n, where arr[i] represents the number of soldiers in the i-th troop. You are also given an integer k. A troop is considered "lucky" if its number of soldiers is a multiple of k.
 Find the minimum total number of soldiers to add across all troops so that at least ⌈n / 2⌉ troops become lucky.
 */
public class TywinWarStrategy {
    public static int minSoldiers(int[] arr, int k) {
         int n=arr.length;
        int [] freq=new int[n];
        for(int i=0;i<arr.length;i++)
        {
           int add = (k - (arr[i] % k)) % k;
           freq[i]=add;
        }
        
        Arrays.sort(freq);
        int sum=0;
        if(n%2==0){
            n=n/2;
        }else{
            n=n/2+1;
        }
        for(int i=0;i<n;i++){
            sum=sum+freq[i];
        }
        
        return sum;
    
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 2, 1};
        int k = 2;
        System.out.println("minimum total number of soldiers to add across all troops so that at least ⌈n / 2⌉ troops become lucky is - "+ minSoldiers(arr, k));
    }
}