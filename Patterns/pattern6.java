package Patterns;

public class pattern6 {
    public static void main(String args[]){
        for(int i=5; i>=0; i--){
            int k=1;
            for(int x=i; x>0; x--){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
