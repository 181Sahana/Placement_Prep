package Recurssion;

public class printnumbers {
    public static void printnums(int n){
        if(n == 6){
            return;
            //base condition
        }
        System.out.println(n);
        printnums(n+1);
    }
    public static void main(String args[]){
        int n = 1;
        printnums(n);
    }
}
