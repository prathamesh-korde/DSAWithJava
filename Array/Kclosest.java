//Given an array of points where each point is represented as points[i] = [xi, yi] on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
//The distance between two points on the X-Y plane is the Euclidean distance, defined as: 
//sqrt( (x2 - x1)2 + (y2 - y1)2 )
//Note: You can return the k closest points in any order, driver code will sort them before printing.

import java.util.PriorityQueue;

public class Kclosest {
     static class Pair {
        int euclidean;
        int[] point;
        
        public Pair(int euclidean, int[] point) {
            this.euclidean = euclidean;
            this.point = point;
        }
    }
    public static  int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.euclidean - a.euclidean);
        for (int i = 0; i < points.length; i++) {
            int distance = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new Pair(distance, points[i]));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().point;
        }

        return res;
    }
    public static void main(String[] args) {
        int k =2;
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        int[][] result = kClosest(points, k);
        System.out.println("The " + k + " closest points to the origin are:");
        for (int[] point : result) {
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }
    }
}
