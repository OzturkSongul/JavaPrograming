package day12_Scanner;

import java.util.Scanner;

public class scannerPractice2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //System.out.println("enter true or false");
        //boolean result= input.nextBoolean();
        System.out.println("enter your name");
        String name= input.next();//Java Programing
        System.out.println("name :" + name);
        input.close();

    }
}
