package day21_ForEachLoop;

import java.util.Arrays;

public class Task5_merging {
    public static void main(String[] args) {

        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {6, 7, 8, 9};
        int[] num3 = {10, 11, 12, 13};

        int[] emerged = new int[num1.length + num2.length + num3.length];//create for enough space for new array
        int j = 0;//new array's index
        for (int each : num1) {
            emerged[j++] = each;
        }
        for (int each : num2) {
            emerged[j++] = each;
        }
        for (int each : num3) {
            emerged[j++] = each;
        }
        System.out.println(Arrays.toString(emerged));
        }
    }

