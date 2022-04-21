package weekOfLLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the term number for Fibonacci Series");
        int n= input.nextInt();
        int num1 = 0, num2 = 1;
        int sum;
        String series = " " + num1 + " " + num2 + " ";//double quates are for space
        for (int i = 2; i <= n; i++)
        {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            series += sum + " ";
        }
        System.out.println("series = " + series);
        System.out.println("final number in the squence is: " + num2);
    }
}
      



