//implementation of Row Transposition Cipher
import java.util.Arrays;
public class css_pr3 { 
    public static String encrypt(String plaintext, String keyword) {
        int[] keyOrder = getKeyOrder(keyword);
        int numColumns = keyword.length();
        int numRows = (int) Math.ceil((double) plaintext.length() / numColumns);
        char[][] grid = new char[numRows][numColumns];
        for (int i = 0, k = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                grid[i][j] = k < plaintext.length() ? plaintext.charAt(k++) : 'X';
        } }
        StringBuilder ciphertext = new StringBuilder();
        for (int col : keyOrder) {
            for (int row = 0; row < numRows; row++) {
                ciphertext.append(grid[row][col]); } } 
        return ciphertext.toString();}
    private static int[] getKeyOrder(String keyword) {
        Integer[] keyOrder = new Integer[keyword.length()];
        for (int i = 0; i < keyword.length(); i++) keyOrder[i] = i;
        Arrays.sort(keyOrder, (a, b) -> Character.compare(keyword.charAt(a), keyword.charAt(b)));
        return Arrays.stream(keyOrder).mapToInt(Integer::intValue).toArray();}  
          public static void main(String[] args) {
        String plaintext = "WEAREDISCOVEREDFLEEATONCE";
        String keyword = "CIPHER";
        String ciphertext = encrypt(plaintext, keyword);
        System.out.println("plaintext message-"+plaintext);
        System.out.println("keyword-"+keyword);
        System.out.println("Encrypted message-" + ciphertext);
    }
}


