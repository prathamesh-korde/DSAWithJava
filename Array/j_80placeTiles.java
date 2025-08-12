//place tiles of size 1xm in a floor of size n*m

public class j_80placeTiles {
    public static int placetile(int n,int m){
        if(n==m){
            return 2;
        };
        if(n<m){
            return 1;
        }

        //verticle placement
        int verticle=placetile(n-m, m);

        //horizontal placement
        int horizontal=placetile(n-1, m);
        return verticle+horizontal;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placetile(n, m));
    }
}
