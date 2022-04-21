package day14_String;

import java.util.Scanner;

public class Task2_EndsWithLy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();
        String lastTwoCha = word.substring(word.length() - 2);

        if (lastTwoCha.equals("ly")){
        System.out.println("really");
    }
    else{
            System.out.println("never mind");





        }
    }
}
