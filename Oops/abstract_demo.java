package Oops;

abstract class Animal{
    Animal(){
        System.out.println("This is animal");
    }

    abstract void walk();
    
    public void eat(){
        System.out.println("This is animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("This is Horse");
    }

    //@Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("Walks on 4 legs");
    }
}

public class abstract_demo {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

    }
}
