package week13;

public class Credentials {

    private String userName= "A12345";
    private String password= "Cydeo123";

    // we need instance method for read and write(getter and setter)

    public String getUserName() {
        if (true)
            return this.userName;// it will also work without this keyword
        return "condition has not been satisfiyed";
    }
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword){
        if(true)
            this.password=newPassword;
        System.exit(-1);

    }








}
