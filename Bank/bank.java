package Bank;

class account{
    public String customer;//accessible anywhere
    protected String email;//accessible within package and subclasses
    private String password;//accessible within class;
    String account_type;//this is default. accessible only within the package

    //password cannot be directly accesed.Hence we use getters and setters.
    //This is the getter function
    public String getpassword(){
        return this.password;
    }

    public void setpassword(String pw){
        this.password = pw;
    }
}

public class bank {
    public static void main(String args[]){
        account a1 = new account();
        a1.customer = "Suha";
        a1.email = "abc@gmail.com";
        a1.setpassword("password@123");
        System.out.println(a1.getpassword());
    }
}
