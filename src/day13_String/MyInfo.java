package day13_String;



import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age=scan.nextInt();
        scan.nextLine();

        System.out.println("enter your gender");
        String gender=scan.next();
        scan.nextLine();

        System.out.println("enter your name");
        String fullName= scan.nextLine();

        System.out.println("enter your phone number");
        long phone= scan.nextLong();
        scan.nextLine();


        System.out.println("enter your post code");
        String PostCode= scan.nextLine();


        System.out.println("enter your school name");
        String SchoolName= scan.nextLine();

        System.out.println("enter your city");
        String city= scan.nextLine();

        System.out.println("enter your state");
        String StateName= scan.next();
        scan.nextLine();

        System.out.println("enter your building name");
        int buildingNum= scan.nextInt();
        scan.nextLine();


        System.out.println("enter your street name");
        String streetName= scan.nextLine();
        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("phone = " + phone);
        System.out.println("PostCode = " + PostCode);
        System.out.println("schoolName= "+SchoolName);

        System.out.println("streetName = " + streetName);
        System.out.println("Address = \n\t" + buildingNum+" " +streetName+"\n\t"+city+" "+StateName);












    }
}
