package Day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class task2_RoomReservation {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("which bedroom you want");

        String Answer= input.next().toLowerCase();
        System.out.println("how many nights you wanna stay");

        int nights=input.nextInt();


        System.out.println("would you like another room");

        String word= input.next().toLowerCase();

        if(word.equals("no")){


        }
    }
}
