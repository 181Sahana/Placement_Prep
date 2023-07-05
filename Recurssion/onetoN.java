package Recurssion;

public class onetoN {
   public static void Print1ToN(int i, int n){
      if(i > n)
         return;
      System.out.print(i + " ");
      Print1ToN(i+1, n);
   }
   public static void main(String args[]){
      int N = 10;
      Print1ToN(1,N);
   }
}
