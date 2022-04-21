package day26_CustomMethodPractice;

import java.util.Arrays;

public class reverseArray {


    public static void main(String[] args) {

        int[]arr={1,2,3,4};
        int[]result= reverse(arr);

        System.out.println(Arrays.toString(result));
    }
    //reverses the given array, return a new array
    public static int[]reverse(int[] array){
        int[]result= new int[array.length]; // check for eneough capasity for newa array

        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {// whenever i decrease j will be increse, j is our new arry index
            result[j] = array[i];
        }
        return result;
        // int result[]= new[] int[array.lenght];
// int j=0;
//for(int i= array.lenght -1;i>=0; i--){
//result(j++)=array[i];

        }
    //reverses the given array, return a new array
    public static double[]reverse(double[] array){
        double[]result= new double[array.length]; // check for eneough capasity for newa array

        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {// whenever i decrease j will be increse, j is our new arry index
            result[j] = array[i];
        }
        return result;

    }
    //reverses the given array, return a new array
    public static char[]reverse(char[] array){
        char []result= new char[array.length]; // check for eneough capasity for newa array

        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {// whenever i decrease j will be increse, j is our new arry index
            result[j] = array[i];
        }
        return result;

    }
    //reverses the given array, return a new array
    public static String[]reverse(String[] array){
        String[]result= new String[array.length]; // check for eneough capasity for newa array

        for (int i = array.length-1,j=0; i >=0 ; i--,j++) {// whenever i decrease j will be increse, j is our new arry index
            result[j] = array[i];
        }
        return result;

    }
}


