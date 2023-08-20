package Oops;

class student{
    String name;
    int age;

    //copy constructor
    student(student s){
        this.name = s.name;
        this.age = s.age;
    }

    student(){

    }

    public void print_info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class copy_constructor {
    public static void main(String args[]){
        student s1 = new student();
        s1.name = "Shubam";
        s1.age = 18;

        student s2 = new student(s1);
        s2.print_info();
    }
}
