import java.util.ArrayList;
import java.util.List;

public class NextGreater {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        List<Integer> list = new ArrayList<>(); 
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    list.add(arr[j]); 
                    found = true;
                    break;
                }
            }
            if (!found) {
                list.add(-1); 
            }
        }
        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));
    }
}
