package day15ForLoop;

import java.util.Scanner;

public class Task3_CalculateSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int number=input.nextInt();

        if(number<0) {
            System.out.println("invalid number");
        }
        else{
            int sum=0;
            for (int i = 0; i <=number; i++) {
                sum+=i;}
            System.out.println(sum);

            }

        }
    }

