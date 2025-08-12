import java.util.*;

public class MaxsumCombination {

    public static ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        int n = a.length;

        Arrays.sort(a);
        Arrays.sort(b);
        reverse(a);
        reverse(b);

        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[0] - x[0]);
        HashSet<String> vis = new HashSet<>();

        pq.offer(new int[]{a[0] + b[0], 0, 0});
        vis.add("0#0");

        ArrayList<Integer> res = new ArrayList<>();

        while (res.size() < k && !pq.isEmpty()) {
            int[] top = pq.poll();
            int sum = top[0], i = top[1], j = top[2];
            res.add(sum);

            if (i + 1 < n && !vis.contains((i + 1) + "#" + j)) {
                pq.offer(new int[]{a[i + 1] + b[j], i + 1, j});
                vis.add((i + 1) + "#" + j);
            }

            if (j + 1 < n && !vis.contains(i + "#" + (j + 1))) {
                pq.offer(new int[]{a[i] + b[j + 1], i, j + 1});
                vis.add(i + "#" + (j + 1));
            }
        }

        return res;
    }

    private static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3};
        int[] b = {2, 5, 1, 6};
        int k = 4;

        ArrayList<Integer> result = topKSumPairs(a, b, k);
        System.out.println("Top " + k + " maximum sum combinations:");
        for (int sum : result) {
            System.out.println(sum);
        }
    }
}
