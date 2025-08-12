import java.util.ArrayList;

public class RabinKarpAlgo {
    static ArrayList<Integer> search(String pat, String txt) {
       ArrayList<Integer> result = new ArrayList<>();
        int d = 256;
        int q = 101; 
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; 
        int t = 0; 
        int h = 1;
        
        for (i = 0; i < M - 1; i++)
            h = (h * d) % q;
        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }
        for (i = 0; i <= N - M; i++) {
            
            if (p == t) {
               
                for (j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j))
                        break;
                }
                if (j == M) {
                    result.add(i + 1); 
                }
            }
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;
                if (t < 0)
                    t = (t + q);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String text = "birthdayboy";
        String pattern = "birth" ;
        System.out.println("all positions (1-based indexing) where the pattern occurs as a substring in the text is "+search(pattern, text));
    }
}
