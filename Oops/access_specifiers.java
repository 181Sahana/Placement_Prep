package Oops;

//java provides 3 access specifiers i.e 3Ps : Private, Public and Protected
// by default all the types, methods and classes will be public
// public classes can be accesed directly unlike private which are to be accesed through its methods
// protected classes are used in inheritence

class access{
    int a;//defAULT
    public int b;//public
    private int c;//private

    void set_private(int x){
        c = x;
    }

    int get_private(){
        return c;
    }
}
class access_specifiers{
    public static void main(String args[]){
        access obj = new access();
        obj.a = 10;//OK
        obj.b = 20;//OK
        //obj.c = 30;//ERROR
        obj.set_private(100);
        obj.set_private(200);
        System.out.println("value of a is : "+ obj.a);
        System.out.println("value of b is : "+ obj.b);
        System.out.println("value of a is : "+ obj.get_private());

    }
}