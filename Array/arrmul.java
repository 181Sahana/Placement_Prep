package Array;

import java.util.Scanner;

public class arrmul {
    public static void ArrayMultiplication(int arrsize, int arr[][]) {
        int resmat[][] = new int[arrsize][arrsize];
        for(int i=0; i<arrsize; i++){
            for(int j=0; j<arrsize; j++){
                resmat[i][j] = 0;
                for(int k=0; k<arrsize; k++){
                    resmat[i][j] += arr[i][k]*arr[k][j];
                }
            }
        }
        for(int i=0;i<arrsize;i++){
            for(int j=0; j<arrsize; j++){
                System.out.print(resmat[i][j]+ " ");
            }
            System.out.println();
        }
    
        return;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify the array size : ");
        int arrsize = sc.nextInt();
        int array[][] = new int[arrsize][arrsize];
        System.out.print("Add the elements of your array : ");
        System.out.println();
        for(int i=0; i<arrsize; i++){
            System.out.println("Enter the elemets of row : "+ (i+1) );
            for(int j=0; j<arrsize; j++){
                array[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<arrsize;i++){
            for(int j=0; j<arrsize; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        ArrayMultiplication(arrsize, array);
    }
}
