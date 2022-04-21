package day21_ForEachLoop;


import java.util.Arrays;

public class Task1_DescendingOrder {
    public static void main(String[] args) {

        int[] numbers = {11, 2, 30, 4, 5, 60};
        int[] descending = new int[numbers.length];
        Arrays.sort(numbers);


        for (int i = numbers.length-1,j=0; i >=0 ; i--,j++) {
            descending[j] = numbers[i];
        }
        System.out.println(Arrays.toString(descending));

        }

        //for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
           // descending[j] = numbers[i];
        //}
       // System.out.println(Arrays.toString(descending));
    }



