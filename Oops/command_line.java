package Oops;
class command_line {
    public static void main(String args[]){
        //System.out.println("My name is Sahana");
        for(int i=0; i<args.length; i++){
            System.out.println("args [" + i + "] : " + args[i]);
        }
    }
}
