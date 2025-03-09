import java.util.ArrayList;

public class J_165CourceSchudel{
    static class Edge {
        int src;
        int dist;

        public Edge(int src, int dist) {
            this.src = src;
            this.dist = dist;
        }
    }

    public static void createGraph(int[][] prerequisites, ArrayList<Edge>[] graph, int numCourses) {
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            graph[prereq].add(new Edge(prereq, course));
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[], int crr, boolean[] vis, boolean[] rec) {
        vis[crr] = true;
        rec[crr] = true;

        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (rec[e.dist])
                return true;
            else if (!vis[e.dist])
                if (isCycle(graph, e.dist, vis, rec))
                    return true;
        }
        rec[crr] = false;
        return false;
    }

    public static  boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) {
            return true;
        }

        ArrayList<Edge>[] graph = new ArrayList[numCourses];
        createGraph(prerequisites, graph, numCourses);

        boolean[] vis = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!vis[i]) {
                if (isCycle(graph, i, vis, rec)) {
                    return false;
                }
            }
        }

        return true;

    }
    public static void main(String[] args) {
        int[][] prerequisites = {{1,0},
                                 {0,1}
                                 };
        int numCourses = 2;
        System.out.println(canFinish(numCourses,prerequisites));
    }
}