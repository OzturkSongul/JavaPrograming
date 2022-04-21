package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class Task3_mathOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
        int num2 = input.nextInt();

        System.out.println("enter a math operator");
        char ch = input.next().charAt(0);

        int result = 0;

        while (!(ch=='+'|| ch=='-'||ch=='*'||ch=='/')) {
            System.err.println("invalid operator, re enter again");
            ch = input.next().charAt(0);
        }

            if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '-') {
                result = num1 - num2;
            } else if (ch == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }

        System.out.println(result);

        }
    }

