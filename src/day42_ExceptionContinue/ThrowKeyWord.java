package day42_ExceptionContinue;

import day11_Swicth_Scanner.ScannerIntro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyWord {

    public static void main(String[] args) {

        System.out.println("enter your age");
        int age=new Scanner(System.in).nextInt();

        if(age<0) {
            //System.err.println("invalid age");
            //System.exit(1);// instead of creating exit method we can use throw method
            throw new InputMismatchException(" age can not be negative");

        }
        if(age>21) {
            System.out.println("you are eligible ");
        }
        else{
            throw new RuntimeException("you must be at least 21 age old");
            }
        }
    }

