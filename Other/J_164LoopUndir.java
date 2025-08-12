
import java.util.ArrayList;

public class J_164LoopUndir {
    static class Edge{
        int src;
        int dist;

        public Edge(int src , int dist){
            this.src=src;
            this.dist=dist;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0 ; i< graph.length ;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
       // graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
       // graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
        
    }
    public static boolean  isCycleUndir( ArrayList<Edge> graph[], boolean[] vis , int crr , int parent){
        vis[crr] = true;
        for(int i = 0 ; i < graph[crr].size() ; i++){
            Edge e = graph[crr].get(i);
            if(vis[e.dist] && e.dist != parent){
                return true;
            }
            else if(!vis[e.dist]){
                if(isCycleUndir(graph, vis, e.dist, crr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] =new ArrayList[v];
        createGraph(graph);
        boolean[] vis= new boolean[v];
        boolean isCycle = isCycleUndir(graph,vis, 0,-1);
        System.out.println("cycle is present "+isCycle);

    }
}
