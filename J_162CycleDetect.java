import java.util.*;
public class J_162CycleDetect {
    static class Edge{
        int src;
        int dist;

        public Edge(int src , int dist){
            this.src = src;
            this.dist = dist;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

       graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge> graph[],int crr,boolean[] vis , boolean[] rec){
        vis[crr]=true;
        rec[crr]=true;

        for(int i = 0 ; i < graph[crr].size() ; i++){
            Edge e = graph[crr].get(i);
            if(rec[e.dist]) //cycle
                return true;
            else if(!vis[e.dist])
             if(isCycle(graph, e.dist, vis, rec))
              return true;
        }
        rec[crr]= false;
        return false;
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean[] vis = new boolean[v];
        boolean[] rec = new boolean[v];
        
        for(int i = 0 ; i<v ; i++){
            if(!vis[i]){
                boolean isCycle = isCycle(graph, i, vis, rec);
                if(isCycle){
                    System.out.println("cycle is prenent in graph "+isCycle);
                    break;
                }else{
                    System.out.println("no cycle present in graph");
                    break;
                }
            }
        }
        
    }
}
