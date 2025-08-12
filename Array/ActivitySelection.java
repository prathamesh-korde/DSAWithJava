import java.util.*;
public class ActivitySelection {
    public static int activitySelection(int[] start, int[] finish){
        Arrays.sort(start);
        Arrays.sort(finish);
        int copunt = 0;
        int maxi =-1;
        int i=0;
        int j=0;
        int n = finish.length;
        while(i<n && j<n){
            if(start[i]<=finish[j]){
                copunt++;
                i++;
            }else{
                copunt--;
                j++;
            }
            
            maxi = Math.max(copunt,maxi);
        }
         maxi = Math.max(copunt,maxi);
         return maxi;
    } 
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        System.out.println(" maximum number of activities that a person can complete in a day is "+activitySelection(start, finish));
    }
}