package LinkedList;
//import java.util.LinkedList;

public class LLPalindrome {
    int data;
    Node next;
    Node head;
        
    public class Node{
        int data;
        Node next;
        //Node head;
        

        Node(int value){
            this.data = value;
           // Node head = new Node(value);
            this.next = null;
        }
        
    }
    //
    

    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        return prev;
    }

    //Hare and Turtle approach
    public Node findMiddle(Node head){
        Node Hare = head;
        Node turtle = head;

        while(Hare.next != null && Hare.next.next != null){
            Hare = Hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public Boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = findMiddle(head);
        Node secondfirst = reverse(mid.next);

        Node firststart = head;
        while(secondfirst != null){
            if(firststart.data != secondfirst.data){
                return false;
            }
            firststart = firststart.next;
            secondfirst = secondfirst.next;
        }
        return true;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        //create a current node to traverse through all the nodes.
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public static void main(String args[]){
        LLPalindrome a  = new LLPalindrome();
        a.addLast(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(2);
        a.addLast(1);
        
        if(a.isPalindrome(a.head)){
            System.out.println("Given LinkedList is Palindrome");
        }
        else
        {
            System.out.println("Given LinkedList is not a Palindrome");
        }
        
    }
}
