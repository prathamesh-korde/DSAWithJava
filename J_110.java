//circular queue

public class J_110 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        public Queue(int n) {
            arr=new int[n];
            this.size=n;
        }
        //is empty?
        public static boolean isEmpty(){
            return rear ==-1 && front==-1;
        }
        //is full?
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //enqueue  O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
        if(front==-1){
            front=0;
        }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        //dequeue O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result=arr[front];
            //if single element
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        //peek  O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }   
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        System.out.println("printing element");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
