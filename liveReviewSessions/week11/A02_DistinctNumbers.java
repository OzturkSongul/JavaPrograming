package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {
    // it will get input from user, and only will store distinct numbers to our arraylist

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();// empty arraylist for our input

        Scanner input= new Scanner(System.in);

        System.out.println("enter integers(input ends with 0): ");
        int value;

        do {                        // checking values of user with loop
            value = input.nextInt();
            if (!list.contains(value) && value != 0){//if arraylist not contain and not equal to zero
            list.add(value);
        }

        }while(value!=0);

        for(Integer numbers: list) {// we will get the values with space between them
            System.out.print(numbers + " ");
        }
        System.out.println();
        // get the size of our array
        System.out.println("the size of our Array " +list.size());

        Collections.sort(list);// your object class needs to be comparable
        System.out.println(list);

        // max and min numbers inside this arraylist

        int max=Collections.max(list);
        int min= Collections.min(list);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.shuffle(list);// random shuffle( randomly mixing numbers)
        System.out.println(list);
        }
    }

