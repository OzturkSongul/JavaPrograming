package day15ForLoop;

import java.util.Scanner;

public class Task4_Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");

        int number=input.nextInt();
        if (number<=0) {
            System.out.println("invalid number");
        }
        else{
            int factorial=1;
            for (int i = 1; i <=number; i++) {

                factorial *= i;
            }
                System.out.print(factorial);
            }

            }



        }


