package day29_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[]countires= {"japan", "Korea", "United States", "united Kingdom", "Turkey"};
       // we dont have remove function in array
        // we need to convert array to Arraylist

        ArrayList<String>list= new ArrayList<>(Arrays.asList(countires));// we convert here array to arraylist
        list.removeIf(p-> p.length()>=10);// p represent each character of the list
                                          // and we removed the element which gretaer than 10

        // converting arraylist to String array

       countires=  list.toArray(new String[0]);// EVERY SINGLE ARRAY LIST HAVE to array method
                                    // we need specified object type of array, which is here stinrg, we need to give
                                    // size, we give 0 then it will be change depend on list lenght

        System.out.println(Arrays.toString(countires));// we are printing here Array, not arraylist
        // create an Array of String called countires
        // write a program that can remove all the country names that have length of 10 or greater
    }
}
