import java.util.ArrayList;
import java.util.Collections;

public class FarthestSmallerRight {

    //O(n^2) Time and O(1) Space
    // static ArrayList<Integer> farMin(int[] arr) {
    //     int n = arr.length;
    //     ArrayList<Integer> ans = new ArrayList<>(n);
    //     for (int i = 0; i < n; ++i) {
    //         ans.add(-1);
    //     }

    //     for (int i = 0; i < n; ++i) {
    //         // check from the end to find the farthest smaller
    //         for (int j = n - 1; j > i; --j) {
    //             // update with the farthest valid index
    //             // break since we need the farthest (rightmost)
    //             if (arr[j] < arr[i]) {
    //                 ans.set(i, j);
    //                 break;
    //             }
    //         }
    //     }
    //     return ans;
    // }


    //O(n*log(n)) Time and O(n) Space
     static ArrayList<Integer> farMin(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        ArrayList<Integer> arrList = new ArrayList<>(n);
        for (int i : arr) arrList.add(i);

        // build suffix min array
        ArrayList<Integer> suff = new ArrayList<>(arrList);
        suff.set(n - 1, arrList.get(n - 1));
        for (int i = n - 2; i >= 0; --i)
            suff.set(i, Math.min(arrList.get(i), suff.get(i + 1)));

        // binary search on suffix for farthest smaller element
        for (int i = 0; i < n; ++i) {
            int lo = i + 1, hi = n - 1, res = -1;

            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (suff.get(mid) < arrList.get(i)) {
                    res = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            ans.set(i, res);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 2};
        ArrayList<Integer> res = farMin(arr);

        for (int x : res)
            System.out.print(x + " ");
        System.out.println();
    }


}
