//print x^n (stack height=n)
public class j_67recursion_1_Q4{
     public static int calPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpow=calPow(x,n-1);
        int xpower=x*xpow;
        return xpower;
     }
    public static void main(String[] args) {
        int x=2 , n=5;
        int ans = calPow(x,n);
        System.out.println(ans);
        
    }
}