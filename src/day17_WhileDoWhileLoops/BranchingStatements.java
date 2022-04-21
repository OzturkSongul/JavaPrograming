package day17_WhileDoWhileLoops;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i='A'; i<='Z' ; i++) {
            if (i == 'F') { //we want the loop stop before F
                break; // exits the loop
            }
            System.out.println(i);
        }
        System.out.println(".......................");

        while(true){

            Scanner scan= new Scanner(System.in);
            System.out.println("enter a number");
            int num=scan.nextInt();

            if (num <0){
                break;

            }
            }
        }
    }

