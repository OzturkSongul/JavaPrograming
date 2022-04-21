package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day12_Tasks {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter how many people you live with");
        int num= input.nextInt();


        if(num<3) {
            System.out.println("live with less than 3 people");
        }else if(num<=6) {
            System.out.println("live with 3-6 people");
        }else {
            System.out.println("live with more than 6 people");
            input.close();

        }

        }
    }

