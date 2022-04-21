package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_Login {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your username");
        String userName= scan.nextLine();
        System.out.println("enter your password");
        String password= scan.nextLine();

        scan.close();
        String correctUserName= "Cydeo";
        String correctPassword="wooden spoon";

        if (userName.equals(correctUserName)) {
            System.out.println("logged in");
        }else{
            System.out.println("incorrect username and password");
        }
    }
}
