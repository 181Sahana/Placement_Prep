package Queues;
public class Queuearraylist {
    static class queue{
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int n){
            arr = new int[n];
            this.size = n;
        }


        
        public static boolean isEmpty(){
            return rear == -1;
        }

        //enqueue
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }  
            int front = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[0];

        }

    }
    public static void main(String args[]){
        queue a = new queue(5);
        a.add(10);
        a.add(20);
        a.add(30);

        while(!a.isEmpty()){
            System.out.println(a.peek());
            a.remove();
        }
    }
    
}
