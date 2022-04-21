package day15ForLoop;

import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {
     //write a program that asks the users to enter a number for 5 times,
     //return the max number

        Scanner input= new Scanner(System.in);
        int max=-2147483648;
        for (int i = 0; i <5 ; i++) {
            System.out.println("enter a number: ");
            int num = input.nextInt();//1,2,3,4

            if (num > max) {
                max = num;
            }
        }
                System.out.println(max);

        }

        }






