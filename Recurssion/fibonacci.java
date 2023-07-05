package Recurssion;

public class fibonacci {
    public static void fib(int a,int b, int n){
        // a is the second last term and b is the last term
        if(n == 0){
            return; 
        }
        int c = a+b;
        System.out.println(c);
        fib(b, c, n-1);

    }

    public static void main(String args[]){
        int a = 0;
        int b = 1;
        System.out.println(0);
        System.out.println(1);
        int n = 6;
        
        fib(a, b, n-2);
    }
    
}
