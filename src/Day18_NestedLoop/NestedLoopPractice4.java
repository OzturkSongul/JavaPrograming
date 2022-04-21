package Day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a= input.nextInt();

        while(a%2==0){
            System.out.println("the number " + a+ " is a even number");
            a= input.nextInt();

            while(!(a%2==0)) {
                System.out.println("the number " + a + " is a odd number");
            }
            System.out.println("would you like to enter another number");

            }
        }
    }

