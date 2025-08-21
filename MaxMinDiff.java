import java.util.Arrays;

public class MaxMinDiff {
    // public static List<List<Integer>> getSubsequences(int[] arr, int index, List<Integer> current, int k) {
    //     List<List<Integer>> result = new ArrayList<>();

    //     if (index == arr.length) {
    //         if (current.size() == k) {
    //             result.add(new ArrayList<>(current)); 
    //         }
    //         return result;
    //     }

    //     current.add(arr[index]);
    //     result.addAll(getSubsequences(arr, index + 1, current, k));
    //     current.remove(current.size() - 1); // backtrack

    //     result.addAll(getSubsequences(arr, index + 1, current, k));

    //     return result;
    // }

    // public static int findMinDiff(List<Integer> list) {
    //     int minDiff = Integer.MAX_VALUE;

    //     List<Integer> sorted = new ArrayList<>(list);
    //     Collections.sort(sorted);

    //     for (int i = 1; i < sorted.size(); i++) {
    //         minDiff = Math.min(minDiff, sorted.get(i) - sorted.get(i - 1));
    //     }
    //     return minDiff;
    // }

    // public int maxMinDiff(int[] arr, int k) {
    //     List<List<Integer>> subsequences = getSubsequences(arr, 0, new ArrayList<>(), k);
    //     int maxMinDiff = Integer.MIN_VALUE;

    //     for (List<Integer> subseq : subsequences) {
    //         int diff = findMinDiff(subseq);
    //         maxMinDiff = Math.max(maxMinDiff, diff);
    //     }
    //     return maxMinDiff;
    // }

    static boolean isPossible(int[] arr, int k, int mid) {
        int count = 1;
        int last = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= mid) {
                count++;
                last = arr[i];
            }
            if (count == k)
                return true;
        }

        return false;
    }

    static int maxMinDiff(int[] arr, int k) {
        // sort the array
        Arrays.sort(arr);

        // define binary search range
        int low = 0;
        int high = arr[arr.length - 1] - arr[0];
        int answer = 0;

        // binary search to find max valid min-diff
        while (low <= high) {
            int mid = (low + high) / 2;

            if (isPossible(arr, k, mid)) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // return the maximum feasible 
        // minimum difference
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 0, 2, 13, 3};
        int k = 4;
        System.out.println(maxMinDiff(arr, k));
    }
    
}
