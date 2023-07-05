package Stack;
import java.util.*;
public class stackpushatbottom {
    //remove the top elements to reach the bottom of the stack
    // then add all the elemnts in the order you want
    // base case nothing but empty stack
    public static void pushatbottom(int data, Stack<Integer> s ){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top = s.pop();
        pushatbottom(data, s);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        pushatbottom(4, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
