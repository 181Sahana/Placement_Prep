package Recurssion;

public class ispalindeome {
    public static boolean IsPalindrome(String s, int start, int end){
        if(start >= end/2){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            //
            return false;
        }
        return IsPalindrome(s, start+1, end-start-1);
    }
    /**
     * @param args
     */
    public static void main(String args[]){
        String str = "abcecba";
        System.out.println(IsPalindrome(str, 0, str.length()-1));
    }
}
