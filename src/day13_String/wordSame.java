package day13_String;

import java.util.Scanner;

public class wordSame {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter a word");
        String word=input.next();



        char firstChacter=word.charAt(0);

        char lastChacter= word.charAt(word.length()-1);


        if (firstChacter==lastChacter){
            System.out.println("same");
        } else{
            System.out.println("not same");
        }











    }
}
