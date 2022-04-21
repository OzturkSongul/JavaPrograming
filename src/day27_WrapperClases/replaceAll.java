package day27_WrapperClases;

import java.util.Arrays;

public class replaceAll {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,3,3};
        array=replaceAll(array,3,300 );
        System.out.println(Arrays.toString(array));

        array= replaceAll(array, 300,500);
        System.out.println(Arrays.toString(array));
    }
    // create a method named replaceAll, that passes three parameters: integer array, integer old element, integer new element

    // replace all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {// whenever element of array matches index number
                array[i] = newValue;
            }
        }
        return array;
    }
    // replace all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {// whenever element of array matches index number
                array[i] = newValue;
            }
        }
        return array;
    }

    // replace all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {// whenever element of array matches index number
                array[i] = newValue;
            }
        }
        return array;
    }
    // replace all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){// whenever element of array matches index number
                array[i] = newValue;
            }
        }
        return array;
    }





}



