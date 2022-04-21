package day13_String;

import java.util.Scanner;

public class word_withThreeLetters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.nextLine();
        input.close();

        int lenght= word.length();
        if (lenght==3) {
            char middleCha = word.charAt(1);
            if (middleCha == 'a') {
                System.out.println("cool word");
            } else {
                System.out.println("okey word");
            }
        } else if(lenght<3) {
            System.out.println("word is too short");
        }
        else{
            System.out.println("word is too long");

            }
        }
    }

