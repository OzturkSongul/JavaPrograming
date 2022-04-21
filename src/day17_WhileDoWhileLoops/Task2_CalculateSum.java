package day17_WhileDoWhileLoops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task2_CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("enter one number");

            int num = input.nextInt();


            if (num < 0) {
                break;
            }
            sum += num;
        }
            System.out.println(sum);
            }
        }











