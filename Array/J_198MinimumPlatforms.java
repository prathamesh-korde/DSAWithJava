import java.util.Arrays;
// greedy algorithm -A greedy algorithm is a problem-solving approach that makes the locally optimal choice at each step,
// hoping to find the global optimum solution. 
//It's a heuristic method that prioritizes immediate gains, potentially leading to a good, though not necessarily optimal, solution. 

public class J_198MinimumPlatforms {
    public static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int copunt = 0;
        int maxi =-1;
        int i=0;
        int j=0;
        int n = arr.length;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                copunt++;
                i++;
            }else{
                copunt--;
                j++;
            }
            
            maxi = Math.max(copunt,maxi);
        }
         maxi = Math.max(copunt,maxi);
         return maxi;
    }

    public static void main(String[] args) {
        int[]  arr = {900 , 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("the minimum number of platforms required at the station is "+findPlatform(arr, dep));
    }
    
}
