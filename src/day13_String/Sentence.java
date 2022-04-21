package day13_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter a sentence");
        String Sentence= input.nextLine();

        int totalChars= Sentence.length();
        System.out.println("total charcter: " + totalChars);

        char lastChars= Sentence.charAt(totalChars-1);
        System.out.println("last chacter: " + lastChars);
        char firstChars= Sentence.charAt(0);
        System.out.println("first chacter: " + firstChars);

    }
}
