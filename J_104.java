
public class J_104 {
    public static void findSubarrays(int[] arr) {
        int n = arr.length;
        
        for (int start = 0; start < n; start++) {
           
            for (int end = start; end < n; end++) {
               
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(); 
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        findSubarrays(array);
    }

}