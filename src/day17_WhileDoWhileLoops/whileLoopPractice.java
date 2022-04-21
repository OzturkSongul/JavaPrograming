package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your username");
        String username=scan.next();
        System.out.println("enter your password");
        String password=scan.next();


        if(username.equals("Cydeo") && password.equals("Cydeo123")) {//if credential are valid
            System.out.println("logged in");
        } else{//if credential are not correct
            int attempt=3;
            while(!(username.equals("Cydeo") && password.equals("Cydeo123")) && attempt>0){//1 attempt
                System.out.println("incorrect username or passowrd, please re-enter");
                System.out.println("enter your name");
                username=scan.next();

                System.out.println("enter your password");//asked again credentials, and everytime executed attempt will decrease
                password= scan.next();
                attempt--;} // until 3 attempt== will be correct execetuted or account will be locked in.
            if (username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("logged in");}
            else {
                System.out.println("your account is locked");
            }
            scan.close();
            }
        }

        }



//username=Cydeo
//password= Cydeo123