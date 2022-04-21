package day16_ForLoopStringPractice;

import java.util.Scanner;

public class task3_multiplePzitiveNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int num1= input.nextInt();
        System.out.println("enter second number");
        int num2=input.nextInt();

        int result= 0;



         if (num1>0 && num2>0) {
             for (int i = 0; i <num2; i++) {
                 result+=num1;
             }
         }
         else{
             System.out.println("invalid number");
         }
        System.out.println(result);



        }

            }

