package Day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter a number");
            int num1 = scan.nextInt();

            System.out.println("enter second number");
            int num2 = scan.nextInt();


            System.out.println("Addition: " + (num1 + num2));
            //we are gonna ask to user if want to continue, if want below section will be repeated.
            //
            System.out.println("would like to continue");
            String answer=scan.next().toLowerCase();// answer of user

            while(!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("invalid answer, enter again");
                answer= scan.next().toLowerCase();}



            if (answer.equals("no")) {
                break;
            }

            }

        }
    }


