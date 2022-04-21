package day21_ForEachLoop;

import java.util.Arrays;

public class Task2_EvenOddNumber {
    public static void main(String[] args) {

int[]numbers={1,2,3,4,5,6,7,8,9};

int countEven=0;
int countOdd=0;

        for (int each: numbers) {
            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
            System.out.println(Arrays.toString(numbers)+"has"+ countEven+"even numbers and" + countOdd+ "odd numbers");


            }
        }





