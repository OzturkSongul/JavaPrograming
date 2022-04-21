package day15ForLoop;

import java.util.Scanner;

public class task5_DigitsLetters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("plase enter your word");

        String word = input.next();
        String digits = "";
        String letters = "";
        String SpecialChars = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;

            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;

            } else {
                if (ch != ' ') ;
                SpecialChars += ch;
            }
        }

            System.out.println("digits:" + digits);
            System.out.println("Letters:" + letters);
                System.out.println("special charaters: " + SpecialChars);
            }

        }



