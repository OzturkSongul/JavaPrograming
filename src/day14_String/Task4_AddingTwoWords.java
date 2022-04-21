package day14_String;

import java.util.Scanner;

public class Task4_AddingTwoWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first word");
        String firstWord = input.next();
        System.out.println("enter second word");
        String secondWord = input.next();
        String result="";

        if (firstWord.charAt(firstWord.length() - 1) == secondWord.charAt(0)) {
            result = firstWord + secondWord.substring(1);
        }
        else {
            result = firstWord + secondWord;
        }
        System.out.println(result);
        }
    }


