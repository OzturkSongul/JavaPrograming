package day12_Scanner;

import java.util.Scanner;

public class day12_Task4 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a product name");
        String ProductName= input.nextLine();

        System.out.println("enter the prize");
        double price= input.nextDouble();

        System.out.println("enter quantity");
        int number= input.nextInt();

        System.out.println("enter your name");
        String FirstName= input.next();

        double TotalPrice= number*price;

        System.out.println(FirstName+ ","+ "your order for " + number + ProductName + " has been placed" + " your bill is " +TotalPrice);
        input.close();

    }
}
