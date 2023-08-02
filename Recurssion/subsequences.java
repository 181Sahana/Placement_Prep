package Recurssion;

public class subsequences {
    public static void SubSequence(String input, int idx, String newstr){
        if(idx == input.length()){
            System.out.println(newstr);
            return;
        } 
        
        char cuurchar = input.charAt(idx);

         //to be
        SubSequence(input, idx+1, newstr+cuurchar);

         //not to be
        SubSequence(input, idx+1, newstr);
    }

    public static void main(String args[]){
        String str = "abc";
        SubSequence(str, 0, "");
    }
}
