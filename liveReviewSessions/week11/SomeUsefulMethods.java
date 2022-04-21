package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);// index number starts with 0
        System.out.println(list);

        list.remove(Integer.valueOf(1));// here we put value which we want to remove
        System.out.println(list);

        // array to arraylist

        String[] arr = {"red", "green", "blue"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr));// we will have arr array as a Arraylist

        System.out.println(list2);

        // array list into an array

        String[] arr2 = new String[list2.size()];// list2 is now arraylist, and we want to do it array into arr2 array
        list2.toArray(arr2);
        System.out.println(Arrays.toString(arr2));

        // now to make an int array to an Integer Arralylist

        int[] arr3 = {1, 2, 3};// our integer numbers
        ArrayList<Integer> list3 = new ArrayList<>();// we created a new arraylist(list3)

        for (Integer each : arr3) {// we put each element of array into list3(arraylist)
            list3.add(each);
        }
        System.out.println(list3);
    }
}

