public class subarrayMinimum {
    public static int sumSubMins(int[] arr) {
       
        int res = 0;
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            res += min;
            for(int j=i+1; j<arr.length; j++){
                min = Math.min(min, arr[j]);
                res += min;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {71, 55, 82, 55};
        System.out.println(" total sum of the minimum elements of every possible subarrays is - "+sumSubMins(arr));
    }
}
