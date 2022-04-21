package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task1_PzotiveAndNegative {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter five  number");
        int countPozi= 0;
        int countnega=0;


        for (int i = 0; i <5 ; i++) {
            int num = input.nextInt();
            if (num > 0) {
                countPozi++;
            } else if (num<0) {
                countnega++;
            }
        }
        System.out.println(countPozi+ "pozitive and " + countnega + "negative");
        input.close();
            }
            
        }

