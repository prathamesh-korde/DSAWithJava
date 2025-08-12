import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {
    public static  ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=profit.length;
        int[][] mat=new int[n][2];
        for(int i=0;i<deadline.length;i++){
            mat[i][0]=deadline[i];
            mat[i][1]=profit[i];
        }
        Arrays.sort(mat,(a,b)->b[1]-a[1]);
        
        int max_idx=-1;
        for(int dead_idx:deadline) max_idx=Math.max(max_idx,dead_idx);
        
        int[] task=new int[max_idx+1];
        int max_profit=0;
        int total_task=0;
        
        for(int i=0;i<n;i++){
            int idx=mat[i][0];
            while(idx!=0&&task[idx]!=0){
                idx--;
            }
            if(idx!=0){
                total_task++;
                task[idx]=mat[i][1];
                max_profit+=mat[i][1];
            }
        }    
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(total_task);
        list.add(max_profit);
        
        return list;
    }
    public static void main(String[] args) {
        int[] deadline = {4, 1, 1, 1};
        int[] profit = {20, 10, 40, 30};
        System.out.println("maximum number of jobs that can be completed within their deadlines & total maximum profit earned by completing those jobs is "+jobSequencing(deadline, deadline));
    }
}
