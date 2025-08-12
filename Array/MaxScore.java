
public class MaxScore {

    //time complexity — O(n³ log n) 

    // public static int findSum(ArrayList<Integer> list,int result){
    //     Collections.sort(list);
    //     int sum = list.get(0)+list.get(1);
    //     result = Math.max(result,sum);
    //     list.clear();
    //     return result;
    // }
    // public static int maxSum(int arr[]) {
        
    //     int result = 0;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int n = arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1 ; j<n ;j++){
    //             for(int k =i ; k<= j ;k++){
    //                 list.add(arr[k]);
    //             }
    //             result = findSum(list,result);
    //         }
    //     }
    //     return result;
    // }


    //2. time complexity - O(n log(n)) 
    // public static int findSum(ArrayList<Integer> list,int result){
    //     if (list.size() < 2) {
    //         return result;
    //     }
        
    //     Collections.sort(list);
    //     int sum = list.get(0)+list.get(1);
    //     return Math.max(result, sum);
    // }
    // public static int maxSum(int arr[]) {
    //     int n = arr.length;
    //     int result = Integer.MIN_VALUE;
        
        
    //     for(int i=0;i<n-1;i++){
    //         ArrayList<Integer> list = new ArrayList<>();
    //         for(int j=i ; j<n ;j++){
    //              list.add(arr[j]);
    //             if (j > i) { 
    //                 result = findSum(list, result);
    //             }
    //         }
    //     }
    //     return result;
    // }

//3.O(n^2)
//  public static int maxSum(int arr[]) {
//         // code here
//         int n = arr.length;
//         int maxSum = 0;
        
//         for(int i=0;i<n-1;i++){
//             int min = arr[i];
//             int secoundMini = arr[i+1];
            
//             for(int j=i+1;j<n;j++){
                
//                 if(min >= arr[j]){
//                     secoundMini = min;
//                     min = arr[j];
//                 }
//                 else if(secoundMini > arr[j]){
//                     secoundMini = arr[j];
//                 }
//                 maxSum = Math.max(maxSum,min+secoundMini);
                
//             }
//         }
//         return maxSum;
//     }

    //4.O(n)

     public static int maxSum(int arr[]) {
        // code here
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n-1;i++){
            int sum = arr[i]+arr[i+1];
            ans = Math.max(ans,sum);
    }
    return ans;
    }
     
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 1, 6 };
        int result = maxSum(arr);
        System.out.println("the maximum sum of the smallest and second smallest elements is "+result);
        
    }
}
