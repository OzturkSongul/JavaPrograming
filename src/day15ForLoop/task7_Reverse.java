package day15ForLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class task7_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your input");
        String word = input.next();


        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }


            System.out.println(reverse);


        }

        }


