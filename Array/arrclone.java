package Array;

public class arrclone {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int arrclon[] = arr.clone();
        System.out.println(arr==arrclon);
    }
}
