public class KnapsackProblem {
        public static int sol(int w, int val[], int wt[], int i) { 
            if (i == val.length) {
                return 0;
            }
            
            int peek = 0;
            if (w >= wt[i]) { 
                peek = val[i] + sol(w - wt[i], val, wt, i + 1);
            }
            
            int notpeek = sol(w, val, wt, i + 1);
            
            return Math.max(peek, notpeek); 
        }
    
        static int knapsack(int W, int val[], int wt[]) {
            return sol(W, val, wt, 0);
        }
        public static void main(String[] args) {
            int W = 4;
       int val[] = {1, 2, 3}; 
       int wt[] = {4, 5, 1} ;
       System.out.println("knapsack  val "+knapsack(W, val, wt));
        }
    }
    
