package week09;

import java.util.Arrays;

public class R02_BiggestInArray {
    public static void main(String[] args) {

        int[][]arr= {{3,12,34,12},{13,7,456,34,3},{-5,-24,-2,10,-4}};
        //find yhe biggest number in each array and store it another one dimensional array
        //I want to print this 2d array at the console
        System.out.println(Arrays.deepToString(arr));// I get the all element of 2D array

        int[]biggestNumber= new int[arr.length];//lenght= the size of 2D array

        for (int i = 0; i <arr.length ; i++) {
            int max = arr[i][0]; // this statement means first element of each array at index i
             // for each one single dimen array I need to have a seperate max assumtion
            for (int each : arr[i]) {
                if (each > max) {
                    max = each;
                }
            }
            biggestNumber[i] = max;
        }
        System.out.println(Arrays.toString(biggestNumber));
            }
        }











