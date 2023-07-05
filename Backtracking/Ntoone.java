package Backtracking;

public class Ntoone {
    public static void printNto1(int n, int i){
        if(i > n)
            return;
        printNto1(n, i+1);
        System.out.println(i);
    }
    public static void main(String args[]){
        int n = 5;
        printNto1(n, 1);
    }
}
