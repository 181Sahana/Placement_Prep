package Queues;
public class queue_implusing_LL {
    
    static class Node{
        Node next;
        int data;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null & tail == null;
        }
        //no need to check the full condition since LL is of variable size

        public static void add(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                tail = head = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;

            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    
    public static void main(String args[]){
        Queue LL = new Queue();
        LL.add(10);
        LL.add(20);
        LL.add(30);
        LL.add(40);
        LL.add(50);
        LL.remove();
        LL.add(60);


        while(!LL.isEmpty()){
            System.out.print(LL.peek()+ " ");
            LL.remove();
        }
    }
}
