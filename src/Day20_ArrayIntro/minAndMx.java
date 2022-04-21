package Day20_ArrayIntro;

import java.util.Scanner;

public class minAndMx {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[]numbers= new int[10];//they are 10 index

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number");
            numbers[i] = input.nextInt();//each number user entered will be assigned to index of the array numbers
        }
          int max=numbers[0];//it is a assumption
         int mini= numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < mini) {
                mini = numbers[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("mini = " + mini);

        }
        }

