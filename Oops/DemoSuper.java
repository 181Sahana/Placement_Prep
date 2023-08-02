package Oops;

class A{
    int i;

}

class B extends A{
    int i;

    B(int a, int b){
        super.i = a;// i in A
        i = b;// i in B
    }

    void show(){
        System.out.println("i in superclass : "+super.i);
        System.out.println("i in subclass : "+ i);
    }
}
public class DemoSuper {
    public static void main(String args[]){
        B obj = new B(1, 2);
        obj.show();
    }
}
