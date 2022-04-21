package day19_LoopPractice;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number :");
        int num1 = input.nextInt();

        System.out.println("enter math operator");
        char operator = input.next().charAt(0);//when I use charat it returns char result

        if (!(operator == '+' || operator == '-')) { //if operator is not valid
            System.err.println("invalid math operator :" + operator);
            System.exit(0);
        }

            System.out.println("enter your second ");
            int num2 = input.nextInt();

            if (operator=='-'){
                System.out.println("num1-num2");}
            else{
                System.out.println(num1+num2);

            }
        }
    }

