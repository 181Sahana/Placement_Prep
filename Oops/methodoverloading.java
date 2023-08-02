package Oops;

class Shapes{

    //method area to claculate area for circle
    float area(float r){
        return (float) ((float)Math.PI*Math.pow(r, 2));
    }

    //Method overloading using 2 parameters
    float area(float length, float height){
        return length*height;
    }

    float area(float l, float h, float w){
        return l*h*w;
    }

}
public class methodoverloading {
    
    public static void main(String args[]){
        Shapes obj = new Shapes();
        //Shapes cuboid = new Shapes(2,2,2);
        //cuboid.area(2,2,2);
        System.out.println("Area of circle with radius 2 is : " + obj.area(2));
        System.out.println("Area of rectangle with length 4 and height 4 is : " + obj.area(4,4));
        

    }
    
}
