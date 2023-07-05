package Queues;
public class cyclicqueue {
    static class queue{
        static int arr[];
        static int size;
        static int front = -1;
        static int rear = -1;

        queue(int n){
            this.size = n;
            arr = new int[n];
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //to add first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res = arr[front];

            //to remove single element
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public static void main(String args[]){
            queue a = new queue(5);
            a.add(10);
            a.add(20);
            a.add(30);
            a.add(40);

            
            a.remove();
    
            while(!a.isEmpty()){
                System.out.println(a.peek());
                a.remove();
            }
        }

    }
    


    
}
