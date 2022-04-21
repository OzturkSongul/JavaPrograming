package day21_ForEachLoop;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {

        int[]numbers={10,20,30,40,50};

        int[] reversed= new int[numbers.length];//make sure that the array has enough capacity for first array



        // it is better to do taht with loop.


       /* reversed[0]=numbers[numbers.length-1];//we are assign the last character of the element to new arrays's first charatacter
        reversed[1]= numbers[3];// I am gonna use j for reversed number, i for numbers index
        reversed[2]= numbers[4];
        reversed[3]=numbers[1];
        reversed[4]=numbers[0];
*/
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {// in here when we look last char of numbers it will be first char of reversed
        reversed[j]= numbers[i];
        }

        System.out.println(Arrays.toString(reversed));


    }
}
