package day17_WhileDoWhileLoops;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
        System.out.println(".............");
         int j= 1;//in while loop intialization should be outside of loop
         while(j<=10) {
             // j++;//when we write iteration before statement it will be exculuve start point.
             System.out.println(j);
             j++;// for starting from 1
         }
        System.out.println("...........");

         int k=1;//first initialization before loop
         do {
             System.out.println(k);//then statement
             k++;
         }while(k<=10);// then condtion


        }
    }

