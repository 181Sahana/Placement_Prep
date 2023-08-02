package Oops;

class fact{
    long factorial(long value){
        long result;

        if(value==1) return 1;
        else result = factorial(value-1)*value;

        return result;
    }
}

public class factorial {
    public static void main(String args[]){
        fact f = new fact();
        System.out.println("Factorial of 5 is : "+ f.factorial(5));
        System.out.println("Factorial of 50 is : "+ f.factorial(50));
        System.out.println("Factorial of 10 is : "+ f.factorial(10));
    }
}
