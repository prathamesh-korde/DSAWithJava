

public class CountpairsSum {
    public static int countPairs(int[][] mat1, int[][] mat2, int x) {
        int res = 0;
        if(mat1==null||mat1.length==0||mat2==null||mat2.length==0)
        return res;
        
        int idx = 0;
        int m1 = mat1.length;
        int n1 = mat1[0].length;
        int[] flatMat1 = new int[m1*n1];
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                flatMat1[idx++] = mat1[i][j];
            }
        }
        idx = 0;
        int m2 = mat2.length;
        int n2 = mat2[0].length;
        int[] flatMat2 = new int[m2*n2];
        for(int i=0;i<m2;i++)
        {
            for(int j=0;j<n2;j++)
            {
                flatMat2[idx++] = mat2[i][j];
            }
        }
        
        int l1 = flatMat1.length;
        int l2 = flatMat2.length;
        int i = 0 , j = l2-1;
        while(i<l1 && j>=0)
        {
            if(flatMat1[i]+flatMat2[j] == x)
            {
                res++;
                i++;
                j--;
            }
            else if(flatMat1[i]+flatMat2[j] < x)
            i++;
            else if(flatMat1[i]+flatMat2[j] > x)
            j--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] mat1 = {{1, 5, 6}, {8, 10, 11}, {15, 16, 18}};
        int[][] mat2 = {{2, 4, 7}, {9, 10, 12}, {13, 16, 20}};
        int x = 21;
        System.out.println("count all pairs {a, b} such that a is from mat1 and b is from mat2 where the sum of a + b is equal to x is " + countPairs(mat1, mat2, x));
        
    }
}
