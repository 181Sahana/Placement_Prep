package Recurssion;

public class sumasc {
    public static void sumofnums(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
            
        sum += i;
        sumofnums(i+1, n, sum);
    }
    public static void main(String args[]){
        sumofnums(1, 5, 0);
    }
    
}
