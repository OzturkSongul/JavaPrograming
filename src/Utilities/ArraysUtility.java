package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer array in separate line

    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //prints each double array in separate line
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //prints each char array in separate line
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //prints each String array in separate line
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //returns the maximum number for integer array

    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];

    }

    //return the maximum number for double array
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //return the min number for int array
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];

    }

    //return the min number for doublearray
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. return boolean. contain(int[], int)

    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }

    //checks if the given double is contained in the given array. return boolean. contain(double[], double)
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. return boolean. contain(char[], char)
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. return boolean. contain(String[], String)
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;//this is new array index number
        for (int each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// whenever i stop it will be last index, so I can assign last index to new element
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;//this is new array index number
        for (double each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;//this is new array index number
        for (String each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;//this is new array index number
        for (char each : array) { //to get elements of old Array
            result[i++] = each;//and assign the elements to new array index
        }
        result[i] = element;// element need to be assigned to the last index
        //result[result.length-1]=element;
        return result;


    }


    //returns the frequency of the given element from the given array
    public static int frequencyElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;

    }

    //returns the frequency of the given element from the given array
    public static double frequencyElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;

            }
        }
        return count;
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




    // remove the index from the array, return to new array
    //                                  {1,2,3,4,5,3}, 2= the result will be {1,2,4,5}
    public static int[] removeElement(int[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
        int j = 0; // this represent the index number of new array

        for (int i = 0; i < array.length; i++) {// i= index number of the array

            if (i == index) {//whenever index number is matched with each it means we are going to remove
                continue;//skip element
            }
            result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

        }
        return result;
    }


    //for each loop only check element, dont check index number, so if there are duplicated element it will be all
    //duplicated element. so we need to regular for loop which look index number

    // remove the index from the array, return to new array
    public static double[] removeElement(double[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
        int j = 0; // this represent the index number of new array

        for (int i = 0; i < array.length; i++) {// i= index number of the array

            if (i == index) {//whenever index number is matched with each it means we are going to remove
                continue;//skip element
            }
            result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

        }
        return result;
    }


//for each loop only check element, dont check index number, so if there are duplicated element it will be all
//duplicated element. so we need to regular for loop which look index number

    // remove the index from the array, return to new array
    public static char[] removeElement(char[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
        int j = 0; // this represent the index number of new array

        for (int i = 0; i < array.length; i++) {// i= index number of the array

            if (i == index) {//whenever index number is matched with each it means we are going to remove
                continue;//skip element
            }
            result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

        }
        return result;
    }


//for each loop only check element, dont check index number, so if there are duplicated element it will be all
//duplicated element. so we need to regular for loop which look index number

    // remove the index from the array, return to new array

    public static String[] removeElement(String[] array, int index) { //for removing spesific element we need to know index and the elemen

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number:" + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1];//for having enough capasity for new array, since we are removing one element then it should be -1
        int j = 0; // this represent the index number of new array

        for (int i = 0; i < array.length; i++) {// i= index number of the array

            if (i == index) {//whenever index number is matched with each it means we are going to remove
                continue;//skip element
            }
            result[j++] = array[i]; // the rest of the indexs after removing will assign to new array

        }
        return result;
    }

    // merge the given two arrays and returns the new array




    //merge the given two arrays and return the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};//temporray array

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);// result is the new array I want to store, each every element of array
        }
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }


    //merge the given two arrays and return the new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};//temporray array

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);// result is the new array I want to store, each every element of array
        }
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and return the new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};//temporray array

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);// result is the new array I want to store, each every element of array
        }
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merge the given two arrays and return the new array
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

















    
    
    











