
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

    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));

    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 4));
}

public static void utilTopoSort(ArrayList<Edge> graph[],int crr , boolean vis[] , Stack<Integer> stack){
    vis[crr] = true;
    for(int i = 0 ; i<graph[crr].size() ; i++){
        Edge e = graph[crr].get(i);
        System.out.print(e.src+"-->");
        System.out.println(e.dist);
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
        int v =5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println("topological Sort sequince-");
        topoSort(graph, v);
    }
    
}
