package day13_String;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word= "Cydeo";
        char thirdChar= word.charAt(2);//is not 3 becouse start from zero
        System.out.println("thirdChar = " + thirdChar);

        //char tenthChar= word.charAt(9);//if the number is not index we get exception
        //System.out.println("tenthChar = " + tenthChar);
        System.out.println(";;;;;;;;;;;;;");


        String s1= "batch 25 is the best batch";

        int totalChars =s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar=s1.charAt(totalChars-1);
        System.out.println("lastChar = " + lastChar);
        //char lastChar=s1.charAt(s1.length()-1);
        //System.out.println("lastChar = " + lastChar);
        System.out.println("lllll");

        String str="wooden spoon";
        str=str.toUpperCase();//"WOODEN SPOON"
        System.out.println("str = " + str);


        System.out.println(str);
        //today is gerat day to learn java programming language.
        String sentence="today is great day to learn java programming language";
          sentence=sentence.toUpperCase();
        System.out.println("sentence = " + sentence);


    }
}
