package day29_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str= "aaaabcccdeeef";// I want to fid every single charater in the string
        // for using frequency method I need to use Arraylist in java
        // we couldnt directly create an Arraylist from String
        // we can create an array out of String as non-Primitive array, then we convert non-primitive array to Arraylist
        // if we use charat method, returns char primitive array, so we couldnt convert, because it is primitive and arraylist doesnt support primitive
        // we should use split method

        String []arr= str.split("");// split method will return String array, we created non=primitive array here
        ArrayList<String>list= new ArrayList<>(Arrays.asList(arr));// then we converted array to arraylist, arr is here nonprimitve array
        // we converted String to Arraylist
        System.out.println("list = " + list);// here we have each character of String

        String unique= "";
        for(String each: list) {
            int frequency = Collections.frequency(list, each);// then we looked frequency of each element form the list
            if (frequency == 1) {
                unique += each;// we conceated the each(unique) to unique String
            }
        }
        System.out.println("unique = " + unique);
        }

        }








