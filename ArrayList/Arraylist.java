package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

//package Collectionframework;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> integerlist = new ArrayList<Integer>();
        
        //add elements
        integerlist.add(10);
        integerlist.add(20);
        integerlist.add(30);
        integerlist.add(40);
        integerlist.add(50);

        System.out.println(integerlist);

        //get elemnts
        int ele = integerlist.get(0);
        System.out.println(ele);

        //adding elements in between
        integerlist.add(2, 100);
        System.out.println(integerlist);

        //set element
        integerlist.set(0,1);
        System.out.println(integerlist);

        //delete element
        integerlist.remove(3);
        System.out.println(integerlist);

        //size
        int size = integerlist.size();
        System.out.println(size);

        //loops
        for(int i = 0;i<integerlist.size();i++){
            System.out.print(integerlist.get(i) + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(integerlist);
        System.out.println(integerlist);
    }
    
}
