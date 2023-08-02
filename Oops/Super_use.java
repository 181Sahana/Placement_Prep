package Oops;


// this program demonstrates how super is used to call the constructor of the superclass in subclass
class Animal{
    private String Animal_type;
    private int age;
    private String gender;

    Animal(Animal x){
        Animal_type = x.Animal_type;
        age = x.age;
    }

    Animal(String type, int age){
        Animal_type = type;
        age = age;
    }

    Animal(String gender){
        gender = gender;
    }

    void what_is_it(){
        System.out.println("Is is an animal");
    }

    void gender(){
        System.out.println("The animal is of gender : "+ gender);
    }

}

class Dog extends Animal{
    String name;
    String breed;

     //creating clone of an object, even though the super() is passed
     //an object of type Dog-not the type of Animal, this still invokes the Constructor
     //Animal(Animal x)
    Dog(Dog d){
        super(d);
        name = d.name;
        breed = d.breed;
    }

    Dog(String type, int age, String dog_name, String breed_name){
        super(type, age);
        name = dog_name;
        breed = breed_name;
    }
    Dog(String animal_gender){
        super(animal_gender);
    }

    void Dog_Info(){
        System.out.println("The dog is of "+ breed + " and the name of dog is "+ name);
    }

    
}

public class Super_use {
    public static void main(String args[]){
        Dog y = new Dog("Animal", 2, "Prathi", "StreetDog");
        y.what_is_it();
        y.Dog_Info();
        y.gender();
        Dog x = new Dog("Female");
        x.gender();
    }
}
