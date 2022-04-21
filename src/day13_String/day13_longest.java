package day13_String;

import java.util.Scanner;

public class day13_longest {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter first string");
        String word= input.nextLine();

        System.out.println("enter second string");
        String word2=input.nextLine();
        input.close();

        int totalCharcter= word.length();
        System.out.println("totalCharcter = " + totalCharcter);

        int totalCharcter1=word2.length();
        System.out.println("totalCharcter1 = " + totalCharcter1);

        if (totalCharcter1<totalCharcter)
        {
            System.out.println(word + " is longest word");
        } else {
        System.out.println(word2 + " is the longest word");}


    }
}
