package day29_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

    ArrayList<String>employees= new ArrayList<>();
    employees.addAll(Arrays.asList("ali", "ahmet","ayse", "david"));
    // we want to keep david and ahmet

        employees.retainAll(Arrays.asList("ahmet", "david"));
// bulk operations only except collection type as a argumnet
        //retainall method, will remove unmatching elements

        System.out.println(employees);

        System.out.println("................");

       String[] names= {"mary", "Monica", "Musti", "sumeyra", "hasan"};
    // remove all element starts with M
        // first we need to convert array to arraylist

        ArrayList<String>list= new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.charAt(0)=='M');

        names=list.toArray(new String[0]);// we created again a new array, and 0 is here will change according to list


        System.out.println(Arrays.toString(names));


    }
}

