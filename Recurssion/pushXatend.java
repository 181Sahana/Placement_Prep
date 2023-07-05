package Recurssion;

public class pushXatend {

    public static void push_to_end(String str, int idx, int count, String newstr, char ch){
        if(idx == str.length()){
            for(int i = 0;i<count; i++){
                newstr += ch;   
            }
            System.out.println(newstr);
            return;
        }
        
        char currchar = str.charAt(idx);
        if(currchar == ch){
            count++;
        }
        else{
            newstr += str.charAt(idx);
        }
        push_to_end(str, idx+1, count, newstr, ch);
    }
    public static void main(String args[]){
        String s = "xabcx";
        push_to_end(s, 0, 0, "",'x');
    }
    
}
