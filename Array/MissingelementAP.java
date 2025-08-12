public class MissingelementAP {

    public static int APDiff(int[] arr,int n){
        int difference = Integer.MAX_VALUE;
        for(int i = 0 ; i<n-1 ; i++){
            int diff = arr[i+1] - arr[i];
            difference = Math.min(difference,diff);
          }
        return difference;
    }

    public static int findMissing(int[] arr) {
        int n = arr.length;
        if(n==1){
            return arr[0]+arr[0];
        }
        int diff = APDiff(arr,n);
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]!=diff){
                return arr[i]+diff;
            }
        }
        return arr[n-1]+diff;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 10, 12, 14};
        System.out.println("missing number in Ap is "+ findMissing(arr));
    }
}
