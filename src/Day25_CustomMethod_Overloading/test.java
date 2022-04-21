package Day25_CustomMethod_Overloading;

import Utilities.StringUtility;

public class test {

    public static void main(String[] args) {

        String str= "Java programming language";

        StringUtility.printEachChar(str);
        System.out.println("............");

        String s1="wooden Spoon";
        String reverse =StringUtility.reverse(s1);
        System.out.println(reverse);

        System.out.println("...............");
        String word= "Civic";
        boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        System.out.println(".............");

        String[] names= {"ayse", "ahmet", "mom", "anna"};// how many palindrome in the array
        int count=0;// we need to create a variable to help count

        for(String each: names) {// we are chcek every single element of array
            if (StringUtility.isPalindrome(each)) {// checking if each element is palindrome
                count++;
            }
        }
        System.out.println(count);
        System.out.println("................");

        String s2= "aaaaabbbbbccccdddd";
        String nonDup =StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);

            }


        }




