package day13_String;

import java.util.Scanner;

public class Task_SameCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word :");
        String word = scan.nextLine();
        scan.close();
        //char firstChar = word.charAt(0);
        //char lastChar = word.charAt(word.length() - 1);

        /*if (firstChar == lastChar) {
            System.out.println("same");
        } else {
            System.out.println("not same");
            */


        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}






