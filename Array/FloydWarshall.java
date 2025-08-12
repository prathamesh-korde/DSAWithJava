public class FloydWarshall {
    public void floydWarshall(int[][] dist) {
        int V = dist.length;
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] < 1e8 && dist[k][j] < 1e8)
                        dist[i][j] = Math.min(dist[i][k] + dist[k][j], dist[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int INF = (int)1e8;
        int[][] dist = {
            {0,    4,   INF, 5,   INF},
            {INF,  0,   1,   INF, 6},
            {2,    INF, 0,   3,   INF},
            {INF,  INF, 1,   0,   2},
            {1,    INF, INF, 4,   0}
        };

        FloydWarshall fw = new FloydWarshall();
        fw.floydWarshall(dist);

        System.out.println("Shortest distance matrix:");
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
