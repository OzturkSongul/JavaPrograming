package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

public class reverseArray2 {

    public static int[] reverse(int[] array) {

        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            ArraysUtility.addElement(result, array[i]); // we get first index of array from last index,
            //then add to new array
        }
        return result;

    }
}





