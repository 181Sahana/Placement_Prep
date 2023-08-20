package Oops;

import java.util.Scanner;
import java.util.Timer;

interface animal{
    void info();
}

interface herbivorous{
    void Iteats();
}

class Horse implements animal, herbivorous{
    public void info(){
        System.out.println("This is horse");
    }
    public void Iteats(){
        System.out.println("It eats only grass and plants");
    }
}

public class interface_demo {
    public static void main(String args[]){
        Horse h = new Horse();
        h.info();
        h.Iteats();

    }
}
