package day14_String;

import java.util.Scanner;

public class Task7_EmailTask1 {
    public static void main(String[] args) {
        String email= "songul_ozturk@gmail.com";
        String firstName= email.substring(0,email.indexOf("_"));
        String lastName= email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String rest= email.substring(email.indexOf("@"));


        email=lastName+"_" + firstName + rest;
        System.out.println(email);



    }
}
