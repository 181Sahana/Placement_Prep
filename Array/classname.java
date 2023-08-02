package Array;

public class classname {
    public static void main(String args[]){
        int arr[] = {};
        Class c=arr.getClass();
        String intname = c.getName();
        System.out.println("primitive int data type"+ intname);

        //Wrapper class
        String [] strarr = {};
        Class C=strarr.getClass();
        String strarrname = C.getName();
        System.out.println("Wrapper class name:" + strarrname);
    }
}
