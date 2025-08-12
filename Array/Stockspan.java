import java.util.*;
public class Stockspan {
    public static  ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty and arr[st.peek()] <= arr[i]
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty, it means no greater element is there on the left
            if (st.isEmpty()) {
                result.set(i, i + 1); // Span is i+1 if no elements are greater than arr[i]
            } else {
                result.set(i, i - st.peek()); // Span is i - st.peek() if there's a greater element
            }

            st.push(i);
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(calculateSpan(arr));
    }
}
