package day14_String;

import java.util.Scanner;

public class Task_FisrtWordWithoutCha {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word=input.next();
        System.out.println("enter your second word");
        String word2=input.next();
        input.close();

        String result=word.substring(1)+word2.substring(1);
        System.out.println(result);
    }
}
