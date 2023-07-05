package Recurssion;

// the stack will be n in this case
public class exponential {
    public static int exp(int x, int n){
        if(n== 0)
            return 1;
        if(x == 0)
            return 0;    
         return x * exp(x, n-1);
    } 
    public static void main(String args[]){
        int x = 6, n = 6;
        System.out.println(exp(x, n));
    }  
}
