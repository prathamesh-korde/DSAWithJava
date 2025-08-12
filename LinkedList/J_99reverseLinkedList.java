//reverse the given linked list

import java.util.Arrays;
import java.util.LinkedList;

public class J_99reverseLinkedList {
    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<Integer>();
            list.addAll(Arrays.asList(1, 5, 7, 3 , 8, 2, 3));
            System.out.println(list);
            for(int i=0 ; i<list.size()/2 ; i++){
                int front = i;
                int back=list.size()-i-1;
                int frontele = list.get(front);
                int backele = list.get(back);
                list.set(front, backele);
                list.set(back,frontele);
            }
            System.out.println("reverse list-"+list);
        }
}
