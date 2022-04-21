package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class mergeTwoArrays2 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4};
        int[]arr2={9,8,7};
        int[]arr3= merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("..........");

        String[] str1={"A","B","C", "D"};
        String[] str2={"D", "E","F"};
        String []result =merge(str1,str2);
        System.out.println(Arrays.toString(result));




    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};//temporray array

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);// result is the new array I want to store, each every element of array
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};//temporray array

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);// result is the new array I want to store, each every element of array
        }
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

}

