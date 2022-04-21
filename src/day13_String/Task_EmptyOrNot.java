package day13_String;

import java.util.Scanner;

public class Task_EmptyOrNot {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.nextLine();
        input.close();

        String result="";
        if(word.length()==0) {
             result="empty";
            System.out.println(result);


        }else if(word.length()>3) {
             result = ""+word.charAt(word.length()-3+ word.charAt(word.length()-2)+ word.charAt(word.length()-1));
            System.out.println(result);
        }else{
             result= word;
            System.out.println(result);



        }
    }
}

