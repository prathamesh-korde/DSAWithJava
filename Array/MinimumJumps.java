/*You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.

For example:

If arr[i] = 3, you can jump to index i + 1, i + 2, or i + 3 from position i.
If arr[i] = 0, you cannot jump forward from that position.
Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position. */
public class MinimumJumps {
    public static int minJumps(int[] arr) {
        int max=0,jump=0,current=0;
         for(int i=0;i<arr.length;i++){
             max=Math.max(max,i+arr[i]);
             if(current==i){
                 if(i!=arr.length-1){
                     jump++;
                 }
                 current=max;
             }else{
                 continue;
             }
         }
         if(current<arr.length-1){
                 return -1;
         }
         return jump;
     }
     public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("minimum number of jumps needed to move from the first position in the array to the last position - "+minJumps(arr));
     }
}
