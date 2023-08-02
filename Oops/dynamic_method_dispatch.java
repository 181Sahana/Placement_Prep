package Oops;

class A{
    void callme(){
        System.out.println("Inside A");
    }
}

class B extends A{
    // override callme()
    void callme(){
        System.out.println("Inside B");
    }
}

class C extends B{
    // override callme()
    void callme(){
        System.out.println("Inside C");
    }
}

public class dynamic_method_dispatch {
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        A r; // create a reference of class A

        r = a;//refere to an A object
        r.callme(); //calls methos inside A

        r = b;//refers to an B object
        r.callme(); //calls methos inside B

        r = c;//refere to an C object
        r.callme(); //calls methos inside C
    }
}
