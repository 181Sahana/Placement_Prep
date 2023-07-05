package Stack;
public class stackLL {
    //to represent the node
    static class Node{
        int data;
        Node next;

        //constructor
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
      
    static class stack{
        //we are making it static, because we are using onlu one node throughtout this function
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;//makes the newnode as head
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
     }
    
}
