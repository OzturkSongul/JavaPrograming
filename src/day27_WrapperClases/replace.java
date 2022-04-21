package day27_WrapperClases;

import java.util.Arrays;

public class replace {
    // create a method named replace tha passes three parameters:integer array, integer index, integer newElement
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = replace(arr, 2, 30);
        System.out.println(Arrays.toString(result));

        System.out.println("..........");
        String[]arr2= {" java", "Phtyon", "C++","Ruby"};

        arr2=replace(arr2,3,"C#");
        System.out.println(Arrays.toString(arr2));
    }

 //replace the element of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index :" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the element of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index :" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the element of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index :" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    //replace the element of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index :" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
}
