
import java.util.*;




public class J_163TopologicalSort {
    static class Edge{
        int src;
        int dist;

        Edge(int src , int dist){
            this.src=src;
            this.dist=dist;
        }
    }

public static void createGraph(ArrayList<Edge> graph[]){
    for(int i = 0 ;i<graph.length ; i++){
        graph[i]=new ArrayList<>();
    }

    graph[2].add(new Edge(2, 3));

    graph[3].add(new Edge(3, 1));

    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));

    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));
}

public static void utilTopoSort(ArrayList<Edge> graph[],int crr , boolean vis[] , Stack<Integer> stack){
    vis[crr] = true;
    for(int i = 0 ; i<graph[crr].size() ; i++){
        Edge e = graph[crr].get(i);
        if(!vis[e.dist]){
            utilTopoSort(graph, e.dist, vis, stack);
        }
    }
    stack.push(crr);
    }

    public static void topoSort(ArrayList<Edge> graph[],int v){
        boolean[] vis = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i=0 ; i<v ; i++){
            if(!vis[i]){
                utilTopoSort(graph, i, vis, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int v =6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println("topological Sort sequince-");
        topoSort(graph, v);
    }
    
}
