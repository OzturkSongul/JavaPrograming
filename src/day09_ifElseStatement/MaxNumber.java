package day09_ifElseStatement;

import org.w3c.dom.ls.LSOutput;

public class MaxNumber {

    public static void main(String[] args) {
        int num1 = 23, num2 = 45;

        if (num1 > num2) {
            System.out.println("num1 is max number");
        } else {
            System.out.println("num2 is max number");

        }
        System.out.println("................");

        int a = 12, b = 34;

        if (a < b) {
            System.out.println("a is minimum number");
        } else {
            System.out.println(" b is minimum number");
        }
        System.out.println("..................");

        int age = 18;

        if (age > 18) ;
        {
            System.out.println("person is eligible for buying alcohol");
        }
        if (age < 18) {
            System.out.println("person is not eligible for buying alcohol");
        }
    }
}








