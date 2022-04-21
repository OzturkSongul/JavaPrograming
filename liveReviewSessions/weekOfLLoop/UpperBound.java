package weekOfLLoop;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        /* write a program to calculate the sum of the numbers from 1 till upper bound
        if upper bound is 5, sum should be 1+2+3+4+5=15
        if upper bound is 11, sum should be 1+2+3+4 ..+11=66.
        if upper bound is 100, sum should be 1+2+....100=5050
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a valid upper bound");
        int upperBound = input.nextInt();//this 3 lines are implementation part.now we need addtional with some variable.


        int sum = 0;
        boolean check = true;//initialization
        for (; check; ) {

            if (upperBound >= 1) {
                for (int i = 1; i <= upperBound; i++) {
                    sum += i;
                    check = false;//this is iteration
                }
            } else {
                System.out.println("please a enter valid number again");
                upperBound = input.nextInt();
                check = true;//iteration
            }
            System.out.println("sum=" + sum);
        }

    }
}

