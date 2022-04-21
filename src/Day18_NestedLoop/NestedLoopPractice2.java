package Day18_NestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedLoopPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
        System.out.println("enter your age");

        int age = input.nextInt();



            while (!(age >= 1 && age <= 120)) {//while age is not valid
                System.err.println("Invalid entery, re-enter again");
                age = input.nextInt();
            }
            System.out.println("would like to contunie ?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("invalid answer, would like to continue");

                answer = input.next().toLowerCase();
            }


            if (answer.equals("no")) {
                break;
            }
        }}


        }





