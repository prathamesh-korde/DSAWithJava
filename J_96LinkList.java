import java.util.LinkedList;
/*
i)addFirst(data) 
ii) addLast(data) or add(data)
iii)size()
iv)get(idx)  
v)clear()
vi)removeFist
vii)removeLast
viii)remove(idx)
ix)peek()  //list.peekLast()  
x)list.poll();  //.pollLast();
*/
public class J_96LinkList {
    public static void main(String[] args) {
        
    
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("is");
    list.addFirst("this");
    list.addLast("a");
    list.add("list");
    System.out.println(list);
    System.out.println(list.size());
    for(int i = 0 ; i < list.size() ; i++ ){
        //getFirst();
        //list.getLast();
        System.out.print(list.get(i)+"--> ");
    }
    System.out.println();
    //list.removeFirst();
    //list.removeLast();
    //remove(Integer.valueOf(10));
    list.remove(String.valueOf("list"));
    System.out.println(list);

    //list.clear();  
    System.out.println(list);
    System.out.println(list.peek());
    System.out.println(list);
    System.out.println(list.poll());
    System.out.println(list);

    }
}
