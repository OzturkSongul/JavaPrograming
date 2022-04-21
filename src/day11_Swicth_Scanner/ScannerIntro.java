package day11_Swicth_Scanner;

import java.util.Scanner;

//import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {
        //Scanner input= new Scanner(System.in);

        Scanner input=new Scanner(System.in);
        System.out.println("enter an integer:");

        int num1= input.nextInt();

        System.out.println("enter a decimal:");

          double num2 = input.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication:"+ (num1*num2));
        input.close();// closes the scanner
        System.out.println("enter an integer");
        int num3= input.nextInt();
        System.out.println(num3);
}
}



