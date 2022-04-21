package week11;

import java.util.Arrays;

public class A01_AddElementToArray {
    public static void main(String[] args) {

        String []browserTypes={"chrome", "firefox","safari"};
        String newBrowserOne="edge";
        String newBrowserTwo= "Opera";

        browserTypes=addElement(browserTypes,newBrowserOne);
        System.out.println(Arrays.toString(browserTypes));

        browserTypes=addElement(browserTypes,newBrowserTwo);
        System.out.println(Arrays.toString(browserTypes));


    }




    // create a method that add new element to an Array
    // method will accept String Array, String variable and will return a new String array
    // with the string variable added to the aarray

    public static String[]addElement(String[]arr, String element) {
        String[] newArray = new String[arr.length + 1];// new array

        int i = 0;
        for (; i < arr.length; i++) {
        newArray[i] = arr[i];// all element in array will be added to new array
    }
        newArray[i]=element;
        return newArray;



        }

        }














