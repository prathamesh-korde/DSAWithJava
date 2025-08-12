import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class J_166SafeStates {
    public static boolean dfs(int node , int[][] graph , HashMap<Integer,Boolean> map){
        if(map.containsKey(node)){
            return map.get(node);
        }
        map.put(node , false);
        for(int neighbour : graph[node]){
            if(!dfs(neighbour,graph,map)){
                return false;
            }
        }
        map.put(node,true);
        return true;
    }
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int n=graph.length;
        for(int i=0 ;i<n ;i++){
            if(dfs(i,graph,map)){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println("safe sequence"+eventualSafeNodes(graph));
    }
}
