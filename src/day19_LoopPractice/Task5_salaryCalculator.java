package day19_LoopPractice;

import java.util.Scanner;

public class Task5_salaryCalculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        while(true){
            System.out.println("how much you make an hour");
            int hourlyRate= input.nextInt();

            if(hourlyRate<=0) {
                System.out.println("invalid entry for hourly rate");
                System.exit(0);
            }
            System.out.println("how many hours do you work per week");
            int hoursPerWeek= input.nextInt();

            if(hoursPerWeek<1 || hoursPerWeek>144) {
                System.out.println("invalid entry");
                System.exit(0);
            }
            System.out.println("would you like to countinu");
            String answer=input.next().toLowerCase();
            while(!(answer.equals("yes")|| (answer.equals("no")))){
                System.out.println("invalid entry, please re-enter");
                System.exit(0);

                if (answer.equals("no")) {
                    System.out.println("thank you");
                    break;
                }

                }
            }
        }
    }

