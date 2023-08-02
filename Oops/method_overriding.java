package Oops;


 //Methods with differing type signatures are overloaded – not
// overridden.
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("Inside A: sum of " + i + " and " + j + " is " + (i + j));
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b); // Call the constructor in class A that takes two integer arguments
        k = c;
    }

    void show() {
        super.show(); // this call's A's show()
        System.out.println("Inside B: value of " + k + " is :" + k);
    }
}

public class method_overriding {
    public static void main(String args[]) {
        A subobj = new B(1, 2, 3);
        subobj.show();
    }
}
