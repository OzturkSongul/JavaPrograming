package Utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }

    }

    //returns the given string and returns the reversed string
    public static String reverse(String str){// if I want to reuse then I used String instead of void
    String result= "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);

        }

        return result;

        }

        //checks if the given String is palindrome, returns boolean
        public static boolean isPalindrome(String str){
            return reverse(str).equalsIgnoreCase(str);

            }

            //checks if the given string is anagram, return boolean
         public static boolean isAnagram(String str1,String str) {//"abc", "bca"
             //to check if it is anagram first need to be sorted

             char[] char1 = str1.toCharArray();//first we create char array
             char[] char2 = str.toCharArray();

             Arrays.sort(char1);
             Arrays.sort(char2);

             return Arrays.equals(char1, char2);
         }

             //removes the duplicates from given string, return String, aaaaabbbbbcccc=>abc

             public static String removeDuplicates(String str){
        String result="";

                 for (int i = 0; i <str.length(); i++) {
                     char each = str.charAt(i);
                     if (!result.contains("" + each)) {
                         result += each;
                     }
                 }
                 return result;

                 }


             }









