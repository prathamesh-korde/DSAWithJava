import java.util.Stack;

class PostfixExpression {
    public int evaluate(String[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (String s : arr) {
            switch (s) {
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args) {
        PostfixExpression pe = new PostfixExpression();
        String[] expression = {"2", "1", "+", "3", "*"}; // Example: (2 + 1) * 3 = 9
        System.out.println("Result: " + pe.evaluate(expression));
    }
}