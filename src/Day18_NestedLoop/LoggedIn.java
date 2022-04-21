package Day18_NestedLoop;

import java.util.Scanner;

public class LoggedIn {
    public static void main(String[] args) {
        //username=Cydeo
        //password=WoodenSpoon
        Scanner input=new Scanner(System.in);
        System.out.println("enter your username");
        String username=input.next();

        System.out.println("enter your password");
        String Password= input.next();

        if (username.equals("Cydeo") && Password.equals("WoodenSpoon")) {
            System.out.println("logged in");
        }
        else{
            for (int i = 1; i <4; i++) {
                System.out.println("incorrect username or password");
                System.out.println("enter your username");
                username = input.next();
                System.out.println("enter your password");
                Password = input.next();
                if (username.equals("Cydeo") && Password.equals("WoodenSpoon")) {
                    System.out.println("logged in");
                    break;
                }
            }// in here loop is stoped because 3 attempts finished
            if (!(username.equals("Cydeo") && Password.equals("WoodenSpoon"))){
                System.err.println("your account is locked");
            }
        }
    }
}
