/*You are given two arrays, color and radius, representing a sequence of balls:


color[i] is the color of the i-th ball.
radius[i] is the radius of the i-th ball.

If two consecutive balls have the same color and radius, remove them both. Repeat this process until no more such pairs exist.


Return the number of balls remaining after all possible removals. */

import java.util.Stack;

public class Removeball {
    public static int findLength(int[] color, int[] radius) {
        
         Stack<int[]> st = new Stack<>();
        
        for(int i = 0 ; i < color.length ; i++){
            boolean flag = false;
            while(!st.isEmpty()){
                int[] top = st.peek();
                if(top[0] == color[i] && top[1] == radius[i]){
                    st.pop();
                    flag = true;
                }
                else
                break;
            }
         if(flag)
          {
             continue;
          }
          else
          st.push(new int[]{color[i],radius[i]});
            
        }
        return st.size();
    }
    public static void main(String[] args) {
        int[]  color = {2, 3, 5};
        int[] radius = {3, 3, 5};
        System.out.println(" number of balls remaining after all possible removals is "+findLength(color, radius));
    }
}
