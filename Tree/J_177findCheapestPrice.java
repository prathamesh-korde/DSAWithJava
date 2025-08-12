//There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.

//You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.

 

import java.util.*;
public class J_177findCheapestPrice { 
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 0; i <= k; i++) {
            int[] temp = Arrays.copyOf(dist, n); 
            for (int[] flight : flights) {
                int from = flight[0], to = flight[1], price = flight[2];
                if (dist[from] != Integer.MAX_VALUE && dist[from] + price < temp[to]) {
                    temp[to] = dist[from] + price;
                }
            }
            dist = temp; 
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }

    public static void main(String[] args) {
        J_177findCheapestPrice sol = new J_177findCheapestPrice();
        int n = 4;
        int[][] flights = {{0,1,100},{1,2,100},{2,3,100},{0,2,500}};
        int src = 0, dst = 3, k = 1;
        System.out.println(sol.findCheapestPrice(n, flights, src, dst, k)); // Output: 200
    }
}
