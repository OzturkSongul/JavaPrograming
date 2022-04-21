package day12_Scanner;

import java.util.Scanner;

public class nextLinePractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your age");

        int age= input.nextInt();

        input.nextLine();//we are taking out enter key from scanner

        System.out.println("enter your name");
        String Name= input.nextLine();

        System.out.println("enter your GPA");
        double gpa= input.nextDouble();
        input.nextLine();// we are taking out enter key

        System.out.println("enter your school name");
        String SchoolName= input.nextLine();

        System.out.println("age = " + age);
        System.out.println("Name = " + Name);
        System.out.println("gpa = " + gpa);
        System.out.println("SchoolName = " + SchoolName);
        input.close();
    }
}








//enter age(nextInt())
//enter full name(nextLine)