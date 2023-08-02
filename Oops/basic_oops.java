package Oops;
class Box{
    float width;
    float height;
    float length;

    float volume(){
        return width*height*length;
    }

    void setdim(float w, float h, float l){
        width = w;
        height = h;
        length = l;
    }
}
public class basic_oops {
    public static void main(String args[]){
        Box obj = new Box();
        //obj.width = 2;
        //obj.height = 2;
        //obj.length = 2;
        //float vol = obj.height*obj.length*obj.width;
        obj.setdim(2,2,2);
        float vol = obj.volume();
        System.out.println(vol);
    }
}
