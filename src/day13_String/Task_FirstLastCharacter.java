package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_FirstLastCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence= input.nextLine();

        char firstCharacter= sentence.charAt(0);
        System.out.println("firstCharacter = " + firstCharacter);
        int totalCharacter= sentence.length();
        System.out.println("totalCharacter = " + totalCharacter);
        char LastCharacter= sentence.charAt(totalCharacter-1);
        System.out.println("LastCharacter = " + LastCharacter);
        String result= firstCharacter + "" + LastCharacter;
        System.out.println(result);


    }
}
