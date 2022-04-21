package day12_Scanner;

import java.util.Scanner;

public class
day12_Task2 {

    public static void main(String[] args) {
         int speedLimit=55;
        Scanner input= new Scanner(System.in);

        System.out.println("enter your current speed");
        int currentSpeed= input.nextInt();
        input.close();
        int overLimit= currentSpeed- speedLimit;
        if(overLimit>0){
            System.out.println("you are driving " +overLimit+ " mp over limit. Slow down");}

    }
}
