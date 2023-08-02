package Oops;

class Test{
    int i;
    int j;

    //this illustrates objects are passed through call by reference
    Test(int x, int y){
        this.i = x;
        this.j = y;
    }

    void meth(){
        i = i*2;
        j = j/2;

    }
}

class Test1{

    //this ilustrates primitive types are passed as value
    void meth1(int a, int b){
        a*=2;
        b/=2;
    }
}


public class argument_passing {
    public static void main(String args[]){

        //call by refernce
        Test obj = new Test(15, 20);
        System.out.println("Call by reference");
        System.out.println("Before call : "+ obj.i + " " + obj.j);
        obj.meth();
        System.out.println("After call : "+ obj.i + " " + obj.j);
        System.out.println();

        //pass by value
        System.out.println("Call by value : ");
        Test1 obj1 = new Test1();
        int i=15;
        int j=20;
        System.out.println("Before call : "+ i + " " + j);
        obj1.meth1(i, j);
        System.out.println("After call : "+ i + " " + j);


    }
}
