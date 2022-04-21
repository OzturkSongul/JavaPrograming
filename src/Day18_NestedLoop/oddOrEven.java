package Day18_NestedLoop;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//first we write scanner



        while (true) { // when user says yes this loop will repeated
        System.out.println("enter a number");
        int num = input.nextInt();



            if (num % 2 == 0) { // when we get number we can check if it is odd or even
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }
            System.out.println("would you like to enter another number");//then we ask if want more number
            //the user can say yes infinitive time, so we can use while loop
            String answer = input.next().toLowerCase();  //we got users answer,yes/no

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("please re-enter, would like to enter another number");
                answer=input.next().toLowerCase();//whenever here user gives valid answer this inner loop will stop
            }




           if(answer.equals("no")){ // if user says no, loop will be stopped here
               break;
           }
        }

    }
}
