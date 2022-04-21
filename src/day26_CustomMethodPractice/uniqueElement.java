package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class uniqueElement {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7};

        int[] unique = uniqueElement(array);
        System.out.println(Arrays.toString(unique));

        double[]array2={1.5,1.5,2.5,3.5,4.5,4.5};
        double[]unique2= uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));
    }

    //return the unique elements of the array as a new array
    public static int[] uniqueElement(int[] array) {
        int[] result = {};//I need array variable, because the result will be array

        for (int each : array) {
            if (ArraysUtility.frequencyElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;


    }

    //return the unique elements of the array as a new array
    public static double[] uniqueElement(double[] array) {
        double[] result = {};//I need array variable, because the result will be array

        for (double each : array) {
            if (ArraysUtility.frequencyElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //return the unique elements of the array as a new array
    public static char[] uniqueElement(char[] array) {
        char[] result = {};//I need array variable, because the result will be array

        for (char each : array) {
            if (ArraysUtility.frequencyElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //return the unique elements of the array as a new array
    public static String[] uniqueElement(String[] array) {
        String[] result = {};//I need array variable, because the result will be array

        for (String each : array) {
            if (ArraysUtility.frequencyElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
}

