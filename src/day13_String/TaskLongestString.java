package day13_String;

import java.util.Scanner;

public class TaskLongestString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a word");
        String word1=scan.nextLine();
        System.out.println("enter another word");
        String word2=scan.nextLine();
        scan.close();

        int totalCharacter= word1.length();
        System.out.println("totalCharacter = " + totalCharacter);

        int totalCharater2=word2.length();
        System.out.println("totalCharater2 = " + totalCharater2);
        //according task solution I dont need to find out totalchacracter, just I can go if statement then use string methods


        if(totalCharacter>totalCharater2) {
            System.out.println("the longest word is : " + word1);
        }
        else{
            System.out.println("the longest word is : " + word2);
        }

    }
}
