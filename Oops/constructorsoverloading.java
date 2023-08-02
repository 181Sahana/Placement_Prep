package Oops;

class shape{
    double width;
    double height;
    double length;

    shape(){
        width = -1;
        height = -1;
        length = -1;
    }

    //constructor overloading
    shape(double len){
        width=height=length=len;
    }

    //constructor overloading
    shape(double w, double h, double l){
        width = w;
        height = h;
        length = l;
    }

    double volume(){
        return width*height*length;
    }
}
public class constructorsoverloading {
    public static void main(String args[]){
        shape none = new shape();
        shape cube = new shape(5);
        shape cuboid = new shape(3, 4, 2);
        System.out.println(none.volume());
        System.out.println(cube.volume());
        System.out.println(cuboid.volume());
    }
}
