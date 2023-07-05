package Queues;
import java.util.*;
import java.util.LinkedList;

public class QueueCF {
    // here Queue is an interface, we cannot create onbjects for interfsce.
    // so we will be using LinkedList which is a class
    // queue is an interface which can be implemented using 2 classes Ararydequeue and LinkedList
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3); 

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
