package day17_WhileDoWhileLoops;

import java.util.Locale;
import java.util.Scanner;

public class Task5_RoomReversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("would you like to reserve a room");
        String answer = input.nextLine().toLowerCase();


        while (!(answer.equals("yes") || (answer.equals("no")))) {

            System.out.println("invalid entery, re-enter again");
            answer = input.nextLine().toLowerCase();
        }


        if (answer.equals("yes")) {
            System.out.println("which type of room you want");
            String room = input.nextLine().toLowerCase();

            while (!(room.equalsIgnoreCase("King Bed") || room.equalsIgnoreCase("queen Bed") || room.equalsIgnoreCase("single bed"))) {
                System.out.println("invalid entery, please re-enter again");
                room = input.nextLine().toLowerCase();
            }

            if (room.equalsIgnoreCase("King Bed")) {
                System.out.println("the prize of " + room + "is : $120");
            } else if (room.equalsIgnoreCase("queen Bed")) {
                System.out.println("the prize of " + room + "is : $100");
            } else {
                System.out.println("the prize of + room + is : $80");
            }
        } else {
            System.out.println("have nice day");
        }
    }
}


















