package Oops;

class SuperClass{
    int i;
    int j;

    void superclassmethod(){
        System.out.println("Inside super class");
    }
}

class SubClass extends SuperClass{
    int k;

    void sum(){
        System.out.println(i+j+k);
    }

    void subclass(){
        System.out.println("Inside subclass");
    }
}

public class Inheritence {
    public static void main(String args[]){
        SuperClass A = new SuperClass();
        SubClass B = new SubClass();
        B.i = 2;
        B.j = 4;
        B.k = 6;

        System.out.println("called on super class object : ");
        A.superclassmethod();
        //A.subclass(); ERROR!!!!! superclass cannot access elements of subclass


        System.out.println();
        System.out.println("Called upon subclass object : ");
        B.superclassmethod();
        B.subclass();
        B.sum();
    }
}
