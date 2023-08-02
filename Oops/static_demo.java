package Oops;

//static makes instances, classes, methods and variables global
class demo{
    static int a = 10;
    static int b = 20;

    static void callme(){
        System.out.println("value of a is : "+ a);
    }
}

public class static_demo {
    public static void main(String args[]){
        demo obj = new demo();
        obj.callme();
        System.out.println("value of b is : "+ demo.b);//calling static class

    }
}
