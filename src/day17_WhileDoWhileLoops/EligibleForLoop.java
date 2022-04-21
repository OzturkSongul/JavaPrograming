package day17_WhileDoWhileLoops;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class EligibleForLoop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age=input.nextInt();//valid age 1-120


        while (!(age>=1 && age<=120 )){
            System.err.println("Invalid age, pelase re-enter");
            age=input.nextInt();}

        System.err.println("if you are us citizen, yes/no");
        String answer= input.next().toLowerCase();

        while (!(answer.equals("yes")|| answer.equals("no"))){
        System.err.println("invalid entry, please re-enter");
            System.err.println("if you are citizen");
            answer=input.next().toLowerCase();}
        if (age>=18 && answer.equals("yes")) {//condtions for voting
            System.out.println("you are eligible for voting");
        }else{
                System.out.println("you are not eligible for voting");
            }

        }

        }


