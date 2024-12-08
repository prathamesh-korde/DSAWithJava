//implementing queue by using array
//for implementing circular queue the all the operation(enqueue,dequeue,front) takes O(1) 
public class J_109Queue {
  static class queue{
    static int arr[];
    static int size;
    static int rear=-1;

    queue(int n){
        this.size=n;
        arr= new int[n];
    }

    public static boolean isEmpty(){
        return rear==-1;
    }

    //enqueue O(1)
    public static void add(int data){
        if(rear==size-1){
            System.out.println("queue is full");
            return;
        }
        rear++;
        arr[rear]=data;
    }

    //dequeue O(n)
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int top = arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return top;
    }

    //peek O(n)
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }

   }
   public static void main(String[] args) {
   queue q = new queue(5);
   q.add(1);
   q.add(2);
   q.add(3);
   q.add(4);
   q.add(5);
  
  while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
  }
   }
    
}
