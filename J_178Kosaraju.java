import java.util.ArrayList;
import java.util.Stack;
public class J_178Kosaraju {

    static class Edge{
        int src;
        int dist;

        public Edge(int src, int dist){
            this.src= src;
            this.dist=dist;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0 ;i<graph.length ; i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
        
    }

    public static void topoSort(ArrayList<Edge> graph[],int crr,boolean vis[],Stack<Integer> st){
        vis[crr]= true;
        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if(!vis[e.dist]){
                topoSort(graph, e.dist, vis, st);
            }
        }
        st.push(crr);
    }

    public static void dfs(ArrayList<Edge> graph[] ,int crr , boolean vis[]){
        vis[crr]=true;
        System.out.print(crr + " ");
        for(int i=0;i<graph[crr].size();i++){
            Edge e = graph[crr].get(i);
            if (!vis[e.dist]){
                dfs(graph, e.dist, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge> graph[],int V){
        //get node in stack(use topo sort) O(V+E)
        Stack<Integer> st = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i = 0 ; i<V ; i++){
            if(!vis[i]){
                topoSort(graph,i,vis,st);
            }
        }

        //create transport graph(replace edge direction)
        ArrayList<Edge> Transpose[] = new ArrayList[V];
        for(int i=0 ;i<Transpose.length ; i++){
            vis[i]=false;
            Transpose[i]=new ArrayList<>();
        }
        for(int crr=0;crr<V;crr++){
            for(int i=0 ; i<graph[crr].size();i++){
                Edge e = graph[crr].get(i);
                Transpose[e.dist].add(new Edge(e.dist, e.src));
            }
        }

        //perform dfs
        while (!st.isEmpty()) {
            int crr = st.pop();
            if(!vis[crr]){
                dfs(Transpose,crr,vis);
                System.out.println();
            }
            
        }
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);

    }
}
