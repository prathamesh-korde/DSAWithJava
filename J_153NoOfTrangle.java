
public class J_153NoOfTrangle {
    int V = 4;
    int countTriangle(int graph[][], boolean isDirected) {
        int count_Triangle = 0;

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < V; k++) {

                    if (graph[i][j] == 1 && graph[j][k] == 1 && graph[k][i] == 1) {
                        count_Triangle++;
                    }
                }
            }
        }

        count_Triangle /= 3;
        count_Triangle /= 6;

        return count_Triangle;
    }

    public static void main(String args[]) {

        int graph[][] = {
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 0}
        };

        int digraph[][] = {
            {0, 0, 1, 0},
            {1, 0, 0, 1},
            {0, 1, 0, 0},
            {0, 0, 1, 0}
        };

        J_153NoOfTrangle obj = new J_153NoOfTrangle();
        System.out.println("The number of triangles in the undirected graph: "
                + obj.countTriangle(graph, false));

        System.out.println("The number of triangles in the directed graph: "
                + obj.countTriangle(digraph, true));
    }
}
