package day29_ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largestNumber {
    public static void main(String[] args) {

        //write a program that can return the nth largest number from an arraylist

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8));
        list.removeIf(p-> Collections.max(list)==p);
        int max= Collections.max(list);

        System.out.println(max);
    }
}
