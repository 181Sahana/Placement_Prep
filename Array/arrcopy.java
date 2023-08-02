package Array;

public class arrcopy {
    public static void main(String[] args) {  
        //declaring a source array  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        //declaring a destination array  
        char[] copyTo = new char[7];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));  

        int[] src = {1,2,3,4,5,6,7,8,9,10};
        int dest[] = new int[5];
        System.arraycopy(src, 0, dest, 0, 5);
        //System.out.println(String.valueOf(dest));
        for(int i=0; i<dest.length;i++){
            System.out.print(dest[i]+ " ");
        }
    }  

}
    
