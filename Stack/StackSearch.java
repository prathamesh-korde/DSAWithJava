import java.util.Stack;

public class StackSearch {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public StackSearch() {
        // Constructor: No need to initialize stacks, as they're already initialized
    }

    public void push(int x) {
        st.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            int removed = st.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int peek() {
        if (st.isEmpty()) {
            return -1; // Return -1 if the stack is empty
        }
        return st.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1; // Return -1 if the minStack is empty
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        StackSearch minStack = new StackSearch(); // Corrected class name
        minStack.push(5);
        minStack.push(2);
        minStack.push(8);
        System.out.println("Minimum: " + minStack.getMin()); // Output: 2
        minStack.pop();
        System.out.println("Top: " + minStack.peek()); // Output: 2
        minStack.pop();
        System.out.println("Minimum: " + minStack.getMin()); // Output: 5
    }
}
