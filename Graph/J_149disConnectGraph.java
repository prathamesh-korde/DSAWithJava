    
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class J_149disConnectGraph {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src , int dest , int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void bfs(ArrayList<Edge> graph[],int v,boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        while(!q.isEmpty()){
            int crr = q.remove();
            if(vis[crr]==false){
                System.out.print(crr+" ");
                vis[crr] = true;

                for(int i= 0; i<graph[crr].size();i++){
                    Edge e = graph[crr].get(i);
                   q.add(e.dest);
                }
            }
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 1));
graph[0].add(new Edge(0, 1, 1));

graph[1].add(new Edge(1, 0, 1));
graph[1].add(new Edge(1, 3, 1));


graph[2].add(new Edge(2, 4, 1));

graph[3].add(new Edge(3, 1, 1));

graph[4].add(new Edge(4, 2, 1));
graph[4].add(new Edge(4, 5, 1));


graph[5].add(new Edge(5, 4, 1));
graph[5].add(new Edge(5, 6, 1));

graph[6].add(new Edge(6, 5, 1));
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean vis[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(vis[i]==false){
                bfs(graph, v, vis, i);
            }
        }
        /*
        1 --- 3 
      /          
    0              5 -- 6
                 /
       2  ---- 4
*/
    }
}

