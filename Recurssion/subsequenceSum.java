package Recurssion;

import java.util.ArrayList;
import java.util.Collections;

public class subsequenceSum {
   public static void sequence(ArrayList<Integer> ip, ArrayList<Integer> op, int index, int sum, int s){
        if(index == ip.size()){
            if(s == sum){
                System.out.println(op);
            return;
            }
            
        }
        op.add(ip.get(index));
        //s += ip.get(index);
        sequence(ip, op, index+1, sum, s+ip.get(index));
        op.remove(ip.get(index));
        //s += ip.get(index);
        sequence(ip, op, index+1, sum, s);
    }

    public static void main(String args[]){
        Integer arr[] = {10,20,30};
        int sum = 30;
        ArrayList <Integer> input = new ArrayList<Integer>();
        Collections.addAll(input,arr);
        ArrayList<Integer> output = new ArrayList<Integer>();
        sequence(input, output, 0, sum, 0);
    }
}
