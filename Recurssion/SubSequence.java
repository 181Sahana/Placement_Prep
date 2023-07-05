package Recurssion;

import java.util.ArrayList;
import java.util.Collections;

public class SubSequence {
    public static void sequence(ArrayList<Integer> ip, ArrayList<Integer> op, int index){
        if(index >= ip.size()){
            System.out.println(op);
            return;
        }
        op.add(ip.get(index));
        sequence(ip, op, index+1);
        op.remove(ip.get(index));
        sequence(ip, op, index+1);
    }

    public static void main(String args[]){
        Integer arr[] = {10,20,30};
        ArrayList <Integer> input = new ArrayList<Integer>();
        Collections.addAll(input,arr);
        ArrayList<Integer> output = new ArrayList<Integer>();
        sequence(input, output, 0);
    }
}
