package Day20_ArrayIntro;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("how many numbers would you like to enter");
        int length=input.nextInt();
        if(length<=0) {
            System.out.println("invalid entry");
            System.exit(0);
        }


        int[]numbers=new int[length];//array needs to have enough capacity tocontain all elements user going

        for (int i = 0; i < length; i++) {
            System.out.println("enter a number");
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        input.close();
        }
    }

