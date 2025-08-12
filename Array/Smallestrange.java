/*Given a 2d integer array arr[][] of size k*n, where each row is sorted in ascending order. 
Your task is to find the smallest range [l, r] that includes at least one element from each of the k lists. 
If more than one such ranges are found, return the first one.
*/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Smallestrange {
class Node {
        int value, row, col;

        Node(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }

    public  ArrayList<Integer> findSmallestRange(int[][] arr) {
        int k = arr.length;
        int n = arr[0].length;

        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.value - b.value);
        int max = Integer.MIN_VALUE;
        int start = 0, end = Integer.MAX_VALUE;

        for (int i = 0; i < k; i++) {
            minHeap.add(new Node(arr[i][0], i, 0));
            max = Math.max(max, arr[i][0]);
        }

        while (true) {
            Node curr = minHeap.poll();
            int min = curr.value;

            // Update range if it's smaller
            if (max - min < end - start) {
                start = min;
                end = max;
            }
            if (curr.col + 1 < n) {
                int nextVal = arr[curr.row][curr.col + 1];
                minHeap.add(new Node(nextVal, curr.row, curr.col + 1));
                max = Math.max(max, nextVal);
            } else {
                // One list is exhausted
                break;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(start);
        result.add(end);
        return result;
    }
    public static void main(String[] args) {
        int[][] arr= {{4, 7, 9, 12, 15}, {0, 8, 10, 14, 20}, {6, 12, 16, 30, 50}};
        Smallestrange rang = new Smallestrange();
        System.out.println(" smallest range  is "+rang.findSmallestRange(arr));
    }

}
