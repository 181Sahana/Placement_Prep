package Backtracking;

public class onetoN {
    public static void print1toN(int i, int N){
        if(i < 1)
            return;
        print1toN(i-1, N);
        System.out.println(i);
    }
    public static void main(String args[]){
        int n = 5;
        print1toN(n, n);
    }
}
