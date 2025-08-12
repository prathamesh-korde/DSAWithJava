//add element at buttom of stack 
//reverse the atack
import java.util.Stack;

public class J_108 {
    public static void addBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //remove element
        int top = s.pop();
        addBottom(data,s);
        //add again
        s.push(top);

    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        addBottom(top, s);

        
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
    
        //addBottom(4,s);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
