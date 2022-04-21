package day29_ArrayListPractice;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class removeIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf(p-> p < 5);// p is here represent each element of arraylist
 // it is called lambda expression
        System.out.println(list);
        System.out.println("................");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // we are gonna remove even number, there is a condtion then removeif
        list2.removeIf(each -> each%2==0);
        System.out.println(list2);

        System.out.println("..............");

        ArrayList<String>list3= new ArrayList<>();
        list3.addAll(Arrays.asList("java", "pyhton", "JavaScropt", "c#"));

        list3.removeIf(p-> p.startsWith("J"));
        System.out.println(list3);

        System.out.println("..............");
        ArrayList<String>names= new ArrayList<>();

        //removing is not Plindorme

        names.addAll(Arrays.asList("Anna", "level", "eye", "java"));

                names.removeIf(name-> StringUtility.isPalindrome(name));
             // !StringUtility= we can have palindrome words
        System.out.println(names);



            }

        }




