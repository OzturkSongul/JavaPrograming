package day14_String;

import java.util.Scanner;

public class task3_StartWith {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("write a word");
        String word= input.next();
        input.close();

        /*second way for solution
        if(word.startsWith("x"));{
           String result=word.substring(1);
            System.out.println(result);
        }
        */
        if(word.charAt(0)=='x'){
            word=word.substring(1);
            System.out.println(word);
            //word= word.replaceFirst("x", "");
        }
        System.out.println();
        }


    }

