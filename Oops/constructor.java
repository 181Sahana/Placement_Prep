package Oops;
class rectangle{
    double length;
    double width;

    //Thhis is the constructor
    rectangle(double l, double h){
        this.length = l;
        this.width = h;
    }

    double area(){
        return length*width;
    }

    double perimeter(){
        return 2*(length+width);
    }

}

public class constructor {
    public static void main(String args[]){
        rectangle obj = new rectangle(2, 3);
        double area = obj.area();
        double perimeter = obj.perimeter();
        System.out.println(area);
        System.out.println(perimeter);
    }
    
}
