package Recurssion;

public class PrintNtimes {
    public static void PrintnTimes(String str, int n, int count){
        if(n == count){
            return;
        }
        System.out.println(str);
        PrintnTimes(str, n, count+1);
    } 
    public static void main(String args[]){
        int n = 5;
        String str = "Sahana";
        PrintnTimes(str, n, 0);
    }
}
