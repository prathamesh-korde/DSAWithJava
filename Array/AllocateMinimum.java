/*Given an array arr[] of integers, where each element arr[i] represents the number of pages in the i-th book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:

Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum. */


import java.util.Arrays;


public class AllocateMinimum {
   
   
    // static boolean check(int[] arr, int k, int pageLimit) {
        
   
    //     int cnt = 1;
    //     int pageSum = 0;
    //     for(int i = 0; i < arr.length; i++) {
            
            
    //         if(pageSum + arr[i] > pageLimit) {
    //             cnt++;
    //             pageSum = arr[i];
    //         }
    //         else {
    //             pageSum += arr[i];
    //         }
    //     }
        
      	
    //     return (cnt <= k);
    // }

    // static int findPages(int[] arr, int k) {
        
    //     if(k > arr.length)
    //         return -1;
    //     int minPageLimit = Arrays.stream(arr).max().getAsInt();
    //     int maxPageLimit = Arrays.stream(arr).sum();

    //     for(int i = minPageLimit; i <= maxPageLimit; i++) {
            
    //         if(check(arr, k, i))
    //             return i;
    //     }

    //     return -1;
    // }
     static boolean check(int[] arr, int k, int pageLimit) {
   
        int cnt = 1;
        int pageSum = 0;
        for(int i = 0; i < arr.length; i++) {
            
           
            if(pageSum + arr[i] > pageLimit) {
                cnt++;
                pageSum = arr[i];
            }
            else {
                pageSum += arr[i];
            }
        }
        
        return (cnt <= k);
    }

    static int findPages(int[] arr, int k) {
        
        if(k > arr.length)
            return -1;
        
        int lo = Arrays.stream(arr).max().getAsInt();
        int hi = Arrays.stream(arr).sum();
        int res = -1;
        
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if(check(arr, k, mid)){
                res = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k = 2;
        System.out.println(findPages(arr, k));
    }
}
}
