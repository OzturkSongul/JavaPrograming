package day13_String;

import java.util.Scanner;

public class InitialsTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter one word");
        String word= input.next();

        System.out.println("enter second word");
        String word2= input.next();

        char initial1=word.toUpperCase().charAt(0);
         char initial2=word2.toUpperCase().charAt(0);

        System.out.println(initial1 + "." + initial2);

    }
}
