package Recurssion;

//The stack height will be logN
public class explogN {
    public static int exp(int x, int n){
        if(n== 0)
            return 1;
        if(x == 0)
            return 0; 
        if(n%2 == 0)
            return exp(x, n/2) * exp(x, n/2);
        else
            return exp(x, n/2) * exp(x, n/2) * x;
    }
    public static void main(String args[]){
        int x = 6, n = 6;
        System.out.println(exp(x, n));
    }  
}
