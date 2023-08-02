package Patterns;

public class pattern7 {
    public static void main(String args[]){
        int n=5;//spaces
        int num=1;//asterisks
        while(n>0){
            for(int i=0;i<n-1;i++){
                System.out.print(" ");
            }
            for(int i=0;i<num;i++){
                System.out.print("*");
            }
            for(int i=1;i<num;i++){
                System.out.print("*");
            }
            System.out.println();
            num++;
            n--;
        }
    }
}
