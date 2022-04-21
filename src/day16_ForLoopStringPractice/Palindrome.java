package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word= "Level";

        String reversed="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
        // first we looked word's reverse then checked if it is palindrome.
        }
        /*
        "java"==>"avaj" false (not palindrome)
        "Anna"==> "annA"==> true
         */


    }

