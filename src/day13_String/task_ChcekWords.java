package day13_String;

import java.util.Scanner;

public class task_ChcekWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.nextLine();
        System.out.println("enter second word");
        String secondWord = scan.nextLine();
        System.out.println("enter third word");
        String thirdWord = scan.nextLine();
        scan.close();

        if (word.length() == secondWord.length() && secondWord.length() == thirdWord.length()) {

            System.out.println("all words are same");

    }else if (word.length()==secondWord.length()) {
            System.out.println("not same or different lenght");
        }
        else if (word.length()==thirdWord.length()){
            System.out.println("not same or different lenght");}
        else if(secondWord.length()==thirdWord.length()) {
            System.out.println("not same or diffrent lenght");
        }
        else{
            System.out.println("all different lenght");
        }
        }

    }

