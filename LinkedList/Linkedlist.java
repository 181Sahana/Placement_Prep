package LinkedList;
public class Linkedlist {
    Node head;
    private int size;

    Linkedlist(){
        this.size = 0;
    }


    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            //by default the new node formed will be pointing to null
            size++;
        }

    }
    
    //add - first, last
    public void addFirst(String data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(String data){
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

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    //deletefirst
    public void deletefirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;//This simply removes the head node and make the next node has head
    }


    //deletelast
    public void deletelast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        //when there is only one node
        if(head.next == null){
            head = null;
            return;
        }

        //create a newnode to traverse
        Node secondlast = head;
        Node lastnode = head.next;
        while(lastnode.next != null){
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsize(){
        return size;
    }

    //reverse
    public void reverseIterate(){
        if (head == null || head.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node nextnode = curr.next;
            curr.next = prev;

            //update
            prev = curr;
            curr = nextnode;
        }
        head.next = null;
        head = prev;
    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public Node findMiddle(Node head){
          
    }

    public boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }

        //find out mid element or node
        Node mid = findMiddle(head);//end of first half
        Node secondfirst = reverse(mid.next); //returns second half first

        Node firsthalfstart = head;
        while(secondfirst != null){
            if(firsthalfstart.val != secondfirst){
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondfirst = secondfirst.next;
        }
        return true;
    }

    public static void main(String args[]){
        Linkedlist list = new Linkedlist();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();
        list.addLast("list");
        list.printlist();
        list.addFirst("This");
        list.printlist();
        list.deletefirst();
        list.printlist();
        //list.deletelast();
        //list.printlist();
        System.out.println(list.getsize());
        list.reverseIterate();
        list.printlist();
        list.head = list.reverseRecursive(list.head);
        list.printlist();
    }
}
