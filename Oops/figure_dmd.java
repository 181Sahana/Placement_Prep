package Oops;

class figure{
    double dim1;
    double dim2;

    figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("Area of undefined");
        return 0;
    }
}

class rectangle extends figure{
    rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Area of rectangle is : ");
        return dim1 * dim2;
    }
}

class triangle extends figure{
    triangle(double a, double b){
        super(a,b);
    }

    double area(){
        System.out.println("Area of triangle is : ");
        return dim1 * dim2 * 0.5;
    }
}
public class figure_dmd {
    public static void main(String args[]){
        figure f = new figure(10,10);
        rectangle r = new rectangle(4, 05);
        triangle t = new triangle(5, 6);

        figure ref;
        ref = r;
        System.out.println(ref.area());

        ref =t;
        t.area();

        ref = f;
        f.area();
    }
}
