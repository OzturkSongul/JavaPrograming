package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task2_FrequencyOfChar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a string and char");

        String word= input.next();
        System.out.println("enter a char");
        char ch= input.next().charAt(0);
        int frequecy= 0;

        for (int i = 0; i < word.length() ; i++) {
            char eachChar = word.charAt(i);
            if (eachChar == ch) {
                frequecy++;
            }
        }
        System.out.println(frequecy);
            }

        }


