package LinkedList;
import java.util.LinkedList;

public class LLCF {
    
    public static void main(String args[]){
        //This creates the empty list
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addLast("is");
        list.add("this");

        System.out.println(list);
        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        //removes first elemnent
        list.removeFirst();
        System.out.println(list);

        //removes last element
        list.removeLast();
        System.out.println(list);


        list.add("Good");
        list.add("Hello");
        list.add("Byeee");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    
        

    }
}
