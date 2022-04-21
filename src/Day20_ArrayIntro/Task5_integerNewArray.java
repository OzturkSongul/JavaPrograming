package Day20_ArrayIntro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5_integerNewArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = new int[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];

        }
        System.out.println(Arrays.toString(newArray));

            }

        }






