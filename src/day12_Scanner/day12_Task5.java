package day12_Scanner;

import java.util.Scanner;

public class day12_Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter a number");
        int stockNumber = input.nextInt();
        if (stockNumber > 0) {
            System.out.println("enter total value");
            double TotalValue = input.nextInt();
            input.nextLine();

            System.out.println("enter company name");
            String companyName = input.nextLine();

            System.out.println("your total stock market holding is " + "$" + TotalValue +
                    " which is made up of " + stockNumber + "." + companyName +
                    " is your company holdings");
            input.close();


        }
    }
}
