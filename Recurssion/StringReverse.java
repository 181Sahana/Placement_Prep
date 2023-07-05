package Recurssion;

public class StringReverse {

    public static void PrintRev(String S, int idx){
        //Time complexity is O(n), where n is length of the string
        if(idx == 0){
            System.out.println(S.charAt(idx));
            return;
        }
        System.out.print(S.charAt(idx));
        PrintRev(S, idx-1);
    }
    public static void main(String args[]){
        String s = "Sahana";
        PrintRev(s, s.length()-1);
    }
    
}
