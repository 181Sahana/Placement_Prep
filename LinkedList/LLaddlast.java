package LinkedList;
public class LLaddlast {
    Node head;
    Node tail;
        
    public class Node{
        int data;
        Node next;
        
        Node(int value){
            this.data = value;
            this.next = null;
        }
    }
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
}
