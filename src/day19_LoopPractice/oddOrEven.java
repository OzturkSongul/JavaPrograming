package day19_LoopPractice;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("enter first number");
        int num = scan.nextInt();

        if ((num & 2) == 0) {
            System.out.println("even Number");
        } else {
            System.out.println("odd number");
        }
        System.out.println("would you like to enter another number");
        String answer = scan.next();
        if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("invalid answer");
            System.exit(0);
        }

        if (answer.equalsIgnoreCase("no")) {
            System.out.println("thank you");
            break;
        }
        }
    }


        }


