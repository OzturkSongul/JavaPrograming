package day27_WrapperClases;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]arr= {1,1,1,2,2,2,2,3,3,3,3,4,4,4};
        arr= removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(".................");

        String[]str={"Ali", "Ali", "Ayse", "Ayse", "Ayse", "fatma","fatma","fatma","fatma"};
        str= removeDuplicates(str);
        System.out.println(Arrays.toString(str));
    }

    //removes the duplicates form the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};// temporary array

        for (int each : array) {// we get each element of array
            if (!ArraysUtility.contains(result, each)) {// whenever array doent not contain each, the it will be added to new array
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    //removes the duplicates form the given array, returns the new array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};// temporary array

        for (double each : array) {// we get each element of array
            if (!ArraysUtility.contains(result, each)) {// whenever array doent not contain each, the it will be added to new array
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    //removes the duplicates form the given array, returns the new array

    public static char[] removeDuplicates(char[] array) {
        char[] result = {};// temporary array

        for (char each : array) {// we get each element of array
            if (!ArraysUtility.contains(result, each)) {// whenever array doent not contain each, the it will be added to new array
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    //removes the duplicates form the given array, returns the new array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};// temporary array

        for (String each : array) {// we get each element of array
            if (!ArraysUtility.contains(result, each)) {// whenever array doent not contain each, the it will be added to new array
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}



