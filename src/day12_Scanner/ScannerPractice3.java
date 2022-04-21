package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your full name:");//wooden spoonenter
        String fullName=input.nextLine();

        System.out.println("enter your programming language:");
        String programming= input.nextLine();
         input.nextLine();

        System.out.println("enter your age =");
        int age=input.nextInt();//24ENTER
        input.nextLine();

        System.out.println("enter your school name");
       String SchoolName=input.nextLine();//enter


        System.out.println("full name = " + fullName);
        System.out.println("programming = "+programming);
        System.out.println("age = " + age);
        System.out.println("SchoolName = " + SchoolName);
        input.close();
    }
}
