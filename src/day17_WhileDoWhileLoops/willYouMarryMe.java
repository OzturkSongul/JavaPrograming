package day17_WhileDoWhileLoops;

import java.util.Locale;
import java.util.Scanner;

public class willYouMarryMe {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Will you marry me");
        String answer= input.next();

        while(!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("invalid entry please re-enter");
            answer= input.next().toLowerCase();
        }

        if (answer.equals("yes")) {
            System.out.println("congrats");
        }else{
                System.out.println("good bye");
            }
        }
    }

