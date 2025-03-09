//You are given a two-dimensional mat[][] of size n*m containing English alphabets and a string word. 
//Check if the word exists on the mat. The word can be constructed by using letters from adjacent cells, 
//either horizontally or vertically. The same cell cannot be used more than once.

public class J_169WordSearch {
    static public boolean isWordExist(char[][] mat, String word) {
        // Code here
        for(int i=0;i<mat.length;i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j]==word.charAt(0)){
                    if(checkIfExists(mat, i, j, word, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    static boolean checkIfExists(char[][] mat,int i, int j, String word, int idx){
        if(idx == word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length){
            return false;
        }
        if(mat[i][j] == word.charAt(idx)){
            mat[i][j] = '-';
           boolean ans = checkIfExists(mat, i+1, j, word, idx+1) || 
           checkIfExists(mat, i-1, j, word, idx+1) ||
           checkIfExists(mat, i, j+1, word, idx+1) ||
           checkIfExists(mat, i, j-1, word, idx+1); 
           mat[i][j] = word.charAt(idx);
           return ans;
           
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        char[][] mat = { 
            {'A', 'B', 'C', 'D'}, 
            {'P', 'Q', 'R', 'S'}, 
            {'U', 'V', 'W', 'X'} 
        };
        String word = "QRWX";
        System.err.println(word+" exist in given matrix "+isWordExist(mat, word));
    }
}
