package day19_LoopPractice;

import java.util.Scanner;

public class Task4_Grade {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        while(true){
        System.out.println("enter your score");
        int score= scan.nextInt();

        if(score<0 || score>100) {
            System.out.println("invalid score");
            System.exit(0);
        }
        char grade=(score>=90)? 'A':(score>=80)? 'B':(score>=70)? 'C': (score>=60)?'D':'F';

        System.out.println("grade = " + grade);
        System.out.println("would you like to countinue");
        String answer= scan.next().toLowerCase();

        while(!(answer.equals("yes")|| (answer.equals("no")))) {
            System.out.println("invalid answer, please re-enter");
            answer = scan.next().toLowerCase();
        }
        if(answer.equals("no")) {
            System.out.println("thank you");
            break;
        }

        }



        }
    }

