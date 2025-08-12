//K-th Largest Sum Contiguous Subarray
//Given an array arr[] of size n, find the sum of the K-th largest sum among all contiguous subarrays. In other words, identify the K-th largest sum from all possible subarrays and return it.

import java.util.PriorityQueue;

public class KthLargestSum {

    public static int kthLargest(int[] arr, int k) {
        int n = arr.length;
        int sum[] = new int[n+1];
        for(int i=0;i<n;i++){
            sum[i+1] = sum[i] + arr[i];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int Contiguoussum = sum[j + 1] - sum[i];

                if(pq.size()<k){
                    pq.add(Contiguoussum);
                }
                else if(pq.peek()<Contiguoussum){
                    pq.poll();
                    pq.add(Contiguoussum);
                }
            }
            
        }

        return pq.peek();
        
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1};
        int k = 3;
        System.out.println("K-th Largest Sum Contiguous Subarray "+kthLargest(arr, k));
    }
}
