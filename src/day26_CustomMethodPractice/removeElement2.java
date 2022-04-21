package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class removeElement2 {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};
        numbers = removeElement(numbers, 1);//we are assigning to a new array
        //numbers = removeElement(numbers, 1);// then will be remove 300;

        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        int[] result = {}; //creating temporray array

        for (int i = 0; i < array.length; i++) {
            if (i != index) {

                ;// as long as index number is not match then will be added to new array
                result= ArraysUtility.addElement(result, array[i]);// result is new array, i is the array after not having matching element
            }




        }
        return result;
    }
}





