import java.util.ArrayList;
import java.util.Stack;

import LinkedList.removeNthNodeFromEnd;

public class parenthesis_mismatch {
    
    public static boolean balanced(String exp){
        char[] ch = exp.toCharArray();
        Stack<Character> s = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{'){
                s.push(ch[i]);
            }
            else{
                if(s.isEmpty())
                    return false;

                char top = s.peek();

                if(ch[i] == ')' && top == '(' || ch[i] == '}' && top == '{' || ch[i] == ']' && top == '[' ) {
                    s.pop();
                }
                    
                else
                    return false;
            }
        }
        return s.isEmpty();
    }

    public static void main(String args[]){
        String exp = "";
        boolean res = balanced(exp);
        if(res == true)
            System.out.println("Balanced");
        else
            System.out.println("Unbalanced");
    }
}

