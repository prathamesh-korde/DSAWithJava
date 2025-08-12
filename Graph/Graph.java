import java.util.*;
import javax.sound.sampled.SourceDataLine;

public  class Graph {
 static class Edge{
    int src;
    int dist;
    int wt;

    public Edge(int src , int dist,int wt){
        this.src=src;
        this.dist=dist;
        this.wt=wt;
    }
 }

public static void createGraph(ArrayList<Edge> graph[]){
    for(int i=0 ; i<graph.length ; i++){
        graph[i]= new ArrayList<Edge>();
    }
    graph[0].add(new Edge(0, 1, 1));
    graph[0].add(new Edge(0, 2, 1));
    graph[1].add(new Edge(1, 0, 1));
    graph[1].add(new Edge(1, 3, 1));
    graph[2].add(new Edge(2, 0, 1));
    
    graph[2].add(new Edge(2, 4, 1));
    graph[3].add(new Edge(3, 1, 1));
    graph[3].add(new Edge(3, 4, 1));
    graph[3].add(new Edge(3, 5, 1));
    graph[4].add(new Edge(4, 2, 1));
    graph[4].add(new Edge(4, 3, 1));
    graph[4].add(new Edge(4, 5, 1));
    graph[5].add(new Edge(5, 3, 1));
    graph[5].add(new Edge(5, 4, 1));
    graph[5].add(new Edge(5, 6, 1));
    graph[5].add(new Edge(6, 5, 1));
      

 }

 public static void printNeighbor(ArrayList<Edge> graph[]){
    for(int i=0;i<graph[2].size();i++){
        Edge e = graph[2].get(i);
        System.out.println(e.dist+" "+e.wt);
    }
 }

 public static void bfsTrv(ArrayList<Edge> graph[],int v,boolean[] vis,int str){
    Queue<Integer> que = new LinkedList<>();
    que.add(str);
    while(!que.isEmpty()){
        int crr=que.remove();
        if(vis[crr]==false){
        System.out.print(crr+" ");
        vis[crr] = true;
        for(int i=0;i<graph[crr].size();i++){
            Edge e = graph[crr].get(i);
            que.add(e.dist);
        }
    }
  }
}

public static void allPath(ArrayList<Edge> graph[],int crr,String path,boolean[] vis, int target){
    if(crr==target){
        System.out.println(path);
        return;
    }
    for(int i=0;i<graph[crr].size();i++){
        Edge e = graph[crr].get(i);
        if(vis[e.dist]==false){
            vis[crr]=true;            
            allPath(graph, e.dist, path+"-->"+e.dist, vis, target);
            vis[crr]=false; 
        }
    }
}

public static void dfstrv(ArrayList<Edge> graph[],int crr,boolean[] vis){
            System.out.print(crr+" ");
            vis[crr]=true;
            for(int i=0;i<graph[crr].size();i++){
                Edge e = graph[crr].get(i);
                if(vis[e.dist]==false){
                dfstrv(graph, e.dist, vis);
            }
        }
}
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        printNeighbor(graph);
    
        boolean[] vis = new boolean[v];
        for(int i = 0; i < v ; i++){
            if(vis[i]==false){
                dfstrv(graph, i, vis);
            }
       }
       System.out.println();
    }
}
