package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = input.nextInt();

        System.out.println("enter second number");
        int num2 = input.nextInt();

        System.out.println("enter a math operator");
        char ch = input.next().charAt(0);// if we use next method we can get char from user input.

        //if(!(ch=='+'|| ch=='-'));// if we write here "if" invalid operator will be executed only 1 time.
        while (!(ch == '+' || ch == '-')) {//if the operator is invalid

            System.out.println("invalid operator, please re-enter");
            ch = input.next().charAt(0);
        }

            System.out.println((ch == '+') ? num1 + num2 : num1 - num2);

            // +,_, we dont know how many times user write invalid operator.
            // if we use for loop
        // for(int i=0; !(ch == '+' || ch == '-');){
        //System.out.println("invalid operator");
       // ch=input.next().charAt(0);
        }
    }



