package Day20_ArrayIntro;

import java.util.Arrays;

public class task6_moveZero {
    public static void main(String[] args) {
        int[]numbers={1,0,2,0,3,4,0,5};
        int []numbers1=new int[numbers.length];
           int j=0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers1[j++] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers1));
            }

        }

